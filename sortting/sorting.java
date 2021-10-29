package sortting;
import java.util.Scanner;

public class sorting {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.printf("\t SORTING\n");
        System.out.printf("-------------------------------\n");
        System.out.printf("1. Selection sort  || O (n^2)\n");
        System.out.printf("2. Bubble sort || O (n^2)\n");
        System.out.printf("3. Insertion sort || O (n^2)\n");
        System.out.printf("4. Merge sort || O (nlogn)\n");

        while(true) {
            System.out.printf("Choice  :");
            int ch=sc.nextInt();
            switch(ch) {
                case 1: 
                    selection.main(null);
                    System.out.println();
                    break;
                case 2: 
                    bubble.main(null);
                    System.out.println();
                    break;
                case 3: 
                    insertion.main(null);
                    System.out.println();
                    break;
                case 4: 
                   MergeSort.main(null);
                    System.out.println();
                    break;
            }

        }

    }
}
