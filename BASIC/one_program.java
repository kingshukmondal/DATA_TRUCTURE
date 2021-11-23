package BASIC;


import java.util.Scanner;

public class one_program {
    public static void main(String args[])
    {

        /*
         * public -> access modifier
         * static -> objects cannot be created in non-static methods so we declare the class as static
         * void -> return type
         * main-> it is the starting point of the program this tells the compiler to start the compilation from here
         * String ->data typ
         * hello this is AN user \n
         * my name is this
         */

        System.out.println("Java is fun");
        System.out.println("Java is an OOPS");
        System.out.print("This is a next line");

        /*
         * primitive data type  --- int ,float ,double ,char,boolean,
         * non-primitive data type --- array,string,
         *The number is 10
         * The number 20 is a positive number
         */

        int a=20;
        float f= 2.54f;
        System.out.println("The number is "+a);
        System.out.println("The number "+a+" is a positive number");
        System.out.printf("the number %d is  a positive number ",a);


    }

}
