package college;

import java.util.Arrays;

public class pca1_A {
    public static void main(String[] args) {
        int arr[]=new int[20];
        int a=0,b=0;
        for(int i=0;i<18;i++)
        {
            if(i%2==0)
            {
                arr[i]=a;
                a=a+7;
            }
            else
            {
                arr[i]=b;
                b=b+6;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[14]);
    }
}
