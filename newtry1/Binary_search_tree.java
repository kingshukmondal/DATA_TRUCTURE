package newtry1;

import java.util.LinkedList;
import java.util.Queue;

class node
{
    int data;
    node left;
    node right;

    node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }

}

class treeone
{
  node root=null;


    void insert(int p)
    {

            if(root==null)
            {
                root=new node(p);
                root.left=root.right=null;
                return;
            }
            else
            {
                node fwd=root;
                node backl,backr;
                node newnode=new node(p);
                while (true)
                {
                    backl=fwd;
                    backr=fwd;
                    if(newnode.data>fwd.data)
                    {
                        fwd=fwd.right;
                        if(fwd==null)
                        {
                            backl.right=newnode;
                            break;
                        }
                    }
                    else if(newnode.data<fwd.data)
                    {
                        fwd=fwd.left;
                        if(fwd==null)
                        {
                            backl.left=newnode;
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("same keys are found");
                        return;
                    }
                }
            }

        }


    void preorder(node p)
    {
        if(p==null)
        {
            return;
        }

        preorder(p.left);
        System.out.print(p.data+" ");
        preorder(p.right);
    }


    int countnodes()
    {
        int count=0;
        Queue<node> eq=new LinkedList<>();
        eq.add(root);
        while (!eq.isEmpty())
        {
            node p=eq.poll();
            if(p.left!=null && p.right!=null)
            {
                count++;
                if(p.left!=null)
                {
                    eq.add(p.left);
                }

                if(p.right!=null)
                {
                    eq.add(p.right);
                }

            }
        }
        return count;
    }

    int countnodesrec(node s)
    {
        if(s==null)
        {
            return 0;
        }
        return countnodesrec(s.left)+countnodesrec(s.right)+1;
    }
}
public class Binary_search_tree {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 2, 8};
        treeone tree=new treeone();
        for(int i=0;i<arr.length;i++)
        {
            tree.insert(arr[i]);
        }
      tree.preorder(tree.root);
        System.out.println();
        System.out.println(tree.countnodes());
        System.out.println(tree.countnodesrec(tree.root));
    }
}
