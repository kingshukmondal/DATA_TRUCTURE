import java.util.Scanner;

public class libkedlistf
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linkedlistnew list=new Linkedlistnew();
            System.out.println("\n\n1.Create!!");
            System.out.println("2.Insert Begin !!!");
            System.out.println("3.Display");
            System.out.println("4.Insert at end");
            System.out.println("5.Insert before a node");
            System.out.println("6.Insert after a node");
            System.out.println("7.Count the number of nodes");
            System.out.println("8.Search");
            System.out.println("9.Insert at a particular position");
            System.out.println("10.Delete 1st node");
            System.out.println("11.Delete last node");
            System.out.println("12.Delete at a particular position");
            System.out.println("13.Reversal");
            System.out.println("14.Selction sort by data");
            System.out.println("15.Bubble sort by data");
            System.out.println("16.Binary search");
            System.out.println("17.Find the middle node");
            System.out.println("18.Merging of two linked lists");

        while(true) 
        {
            int n=sc.nextInt();
            switch(n) 
            {
                case 1: 
                    System.out.println("Enter the number of nodes ::");
                    int num=sc.nextInt();
                    for(int i=0;i<num;i++) 
                    {
                        System.out.print("Enter data "+(i+1)+"::");
                        int data=sc.nextInt();
                        list.create(data);
                    }
                    break;
                case 2:
                    System.out.print("Enter the data ::");
                    int data=sc.nextInt();
                    list.insertatbeg(data);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.print("Enter the data ::");
                    int dat=sc.nextInt();
                    list.add(dat);
                    break;
                case 5:
                    System.out.print("Enter the number before which you want to insert ::");
                    int nun =sc.nextInt();
                    System.out.print("Enter the data ::");
                    int d=sc.nextInt();
                    list.insertbefore(nun,d);
                    break;
                case 6:
                    System.out.print("Enter the number after which you want to insert ::");
                    int n1 =sc.nextInt();
                    System.out.print("Enter the data ::");
                    int d1=sc.nextInt();
                    list.insertafter(n1, d1);
                    break;
                case 7:
                    list.count();
                    break;
                case 8:
                    System.out.print("Enter the number you want to search for ::");
                    int elem =sc.nextInt();
                    list.search(elem);
                    break;
                case 9:
                    System.out.print("Enter the position::");
                    int position=sc.nextInt();
                    System.out.print("Enter the data ::");
                    int d2=sc.nextInt();
                    list.insertpos(d2, position);
                    break;
                case 10:
                    list.deletefirst();
                    break;
                case 11:
                    list.lastnode();
                    break;
                case 12:
                    System.out.println("Enter the data you want to delete ::");
                    int p=sc.nextInt();
                    list.particular(p);
                    break;
                case 13:
                    list.reversal();
                    break;
                case 14:
                    list.selectiondata();
                    break;
                case 15:
                    list.bubblesort();
                    break;
                case 16:
                    System.out.println("Enter the data you want to Search 1!");
                    int key=sc.nextInt();
                    list.binarysearch(key);
                    break;
                case 17:
                    System.out.println("The middle dats is"+list.middle(list.ghead(),null).data);
                    break;
                case 18:
                    merging.main(null);
                    break;
            
                case 19:
                    
                    break;
                }
        }

    }
}
