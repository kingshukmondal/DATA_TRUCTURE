package BASIC;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st1=sc.next();
        String st2= sc.next();

        checkAana(st1,st2);
    }

    private static void checkAana(String st1, String st2) {
        int a1[]=new int[200];

        Arrays.fill(a1,0);

        for(int i=0;i<st1.length();i++)
        {
            int p=st1.charAt(i);
            a1[p]++;
        }
        boolean ex=true;
        for(int i=0;i< st2.length();i++)
        {
            int s=st2.charAt(i);
            int p=a1[s];
            if(p==0)
            {
                ex=false;
                break;
            }
            else
            {
                a1[p]--;
            }
        }

        if(ex)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not aanagram");
        }

    }

    int isPossible (String S)
    {
        // your code here
        int n=S.length();
        int tws=0;
        int ones=0;
        int che[]=new int[200];

        Arrays.fill(che,0);

        for(int i=0;i<n;i++)
        {
            int p=S.charAt(i);
            che[p]++;
        }


        for(int i=0;i<n;i++)
        {
            int p=S.charAt(i);
            int k=che[p];
            if(k==2)
            {
                tws++;
            }
            else if(k==1)
            {
                ones++;
            }
        }

        if(tws%2==0 &&(ones==0 || ones==1))
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}
/*
allergy, b = allergic
 */