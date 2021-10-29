package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
    }
}

class bitree
{
    Node root=null;
    void insert(int data)
    {
        if(root==null)
        {
            Node newnode=new Node(data);
            root=newnode;
            newnode.left=newnode.right=null;
            return;
        }
        Node ptr=root;
        Node s=null;
        while (ptr!=null)
        {
            s=ptr;
            if(data> ptr.data)
                ptr=ptr.right;
            else if(data< ptr.data)
                ptr=ptr.left;
            else {
                System.out.println("Duplicate node found");
                return;
            }
        }
        if(data>s.data)
        {
            s.right=new Node(data);
        }
        else
        {
            s.left=new Node(data);
        }
    }

    void levelorder()
    {
        if(root==null)
        {
            System.out.println("the tree is empty");
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty())
        {
            Node newnode=q.poll();
            System.out.print(newnode.data+" ");
            if(newnode.left!=null)
                    q.add(newnode.left);
            if(newnode.right!=null)
                    q.add(newnode.right);
        }

    }

    void inorder(Node root)
    {

        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+ " ");
        }
    }

    void search(int data)
    {
        Node ptr=root;
        while (ptr!=null)
        {
            if(ptr.data==data)
            {
                System.out.println("Found");
                return;
            }
            else if(data>ptr.data)
                ptr=ptr.right;
            else if(data<ptr.data)
                ptr=ptr.left;
        }
        System.out.println("Data not found :");
    }

    void getminmax()
    {
        Node p1,p2;
        p1=root;
        p2=root;
        int min=0,max=0;
        while (p1!=null)
        {
            min=p1.data;
            p1=p1.left;
        }
        while (p2!=null)
        {
            max=p2.data;
            p2=p2.right;
        }
        System.out.println("MINIMUM ="+min+"\tMAXIMUM ="+max);
    }

    int getmax(Node root)
    {
        if(root==null)
        {
            return root.data;
        }
        Node p1=root;
        int min=0;
        while (p1!=null)
        {
            min =p1.data;
            p1=p1.right;
        }
        return min;
    }

    Node delete(Node root,int val)
    {
        if(root==null)
        {
            System.out.println("Tree is empty !!");
            return root;
        }
        Node parent=root;
        Node child=root;
        boolean f= false;
        while (child!=null)
        {
            if(val==child.data) {
                f = true;
                break;
            }
            parent=child;
            if(val<child.data)
            {
                child=child.left;
            }
            else
            {
                child=child.right;
            }
        }

        if (!f)
        {
            System.out.println("key not found !");
            return root;
        }
        //NO children
        if(child.left==null && child.right==null)
        {
            if(parent.left==null && parent.right==null)
            {
                root=null;
                return root;
            }
            if(parent.left==child)
                parent.left=null;
            if(parent.right==child)
                parent.right=null;
        }

        //two Children
         else if(child.left!=null && child.right!=null)
         {
             int x=getmax(child.left);
             child.data=x;
             delete(child.left,x);
             return root;
         }

         //one child
        else
        {
            if(root==child)
            {
                if(child.left==null)
                {
                    root=child.right;
                    return root;
                }
                else
                {
                    root=child.left;
                    return root;
                }
            }
            Node ptr;
            if (child.left != null) {
                if (parent.left == child) {
                    ptr = child.left;
                    parent.left = ptr;
                    return root;
                }
                if (parent.right == child) {
                    ptr = child.left;
                    parent.right = ptr;
                    return root;
                }
            }

            if (child.right != null) {
                if (parent.left == child) {
                    ptr = child.right;
                    parent.left = ptr;
                    return root;
                }
                if (parent.right == child) {
                    ptr = child.right;
                    parent.right = ptr;
                    return root;
                }
            }
        }
        return root;
        }

    int  height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int hleft = 0,hright=0;
        if(root.left!=null)
            height(root.left);
        else
            height(root.right);

        if(hleft>hright)
           return 1+hleft;
        else
           return 1+hright;

        }

    int noofnodes(Node root)
    {
        if (root==null)
        {
            return 0;
        }
        else
            return noofnodes(root.left)+noofnodes(root.right)+1;
    }

    int noofinternalnodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 0;
        }
        return noofinternalnodes(root.left)+noofinternalnodes(root.right)+1;
    }


    int noofetxteranlnodes(Node root)
    {
        if (root==null)
            return 0;
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        return noofetxteranlnodes(root.left)+noofetxteranlnodes(root.right);
    }


}

public class binaryse {
    public static void main(String[] args) {
    bitree tree=new bitree();
        Scanner sc=new Scanner(System.in);

        System.out.println("1. Insert");
        System.out.println("2. Level Order");
        System.out.println("3. Inorder");
        System.out.println("4. Preorder");
        System.out.println("5. Postorder");
        System.out.println("6. Search");
        System.out.println("7. Maximum and Minimum");
        System.out.println("8. Delete a Node");
        System.out.println("9. Height of BST");
        System.out.println("10. No of nodes ");
        System.out.println("11. The number of Internal nodes");
        System.out.println("12. The number of Enternal nodes");


        while(true)
        {
            System.out.println();
            System.out.print("Choice :");
           int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("enter the number of Nodes");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++)
                    {
                        tree.insert(sc.nextInt());
                    }
                    break;
                case 2:
                    System.out.print("\nLEVEL ORDER :");
                    tree.levelorder();
                    break;
                case 3:
                    System.out.print("\nINORDER :");
                    tree.inorder(tree.root);
                    break;
                case 4:
                    System.out.println();
                    System.out.print("PREORDER :");
                    tree.preorder(tree.root);
                    break;
                case 5:
                    System.out.println();
                    System.out.print("POSTORDER :");
                    tree.postorder(tree.root);
                    break;
                case 6:
                    System.out.println("\nEnter the data to be searched :");
                    tree.search(sc.nextInt());
                    break;
                case 7:
                    System.out.println("\nThe maximum and minimum of the numbers are");
                    tree.getminmax();
                    break;
                case 8:
                    System.out.println("Enter the data to be deleted :");
                    int val=sc.nextInt();
                    tree.root=tree.delete(tree.root, val);
                    break;
                case 9:
                    System.out.println("The height of the Binary tree ::"+tree.height(tree.root));
                    break;
                case 10:
                    System.out.println("The number of nodes in the bst is :");
                    System.out.println(tree.noofnodes(tree.root));
                    break;
                case 11:
                    System.out.println("The total number of internal nodes are  :");
                    System.out.println(tree.noofinternalnodes(tree.root));
                    break;
                case 12:
                    System.out.println("The total number of External nodes are  :");
                    System.out.println(tree.noofetxteranlnodes(tree.root));
                    break;

            }
        }
    }
}