package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class files1 {
    public static void main(String[] args) {
        double i;
        char j = 'b';

        switch (j) {
            case 'a':
            case 'A':
                i = 7.5;
                break;
            case 'b':
            case 'B':
                i = 5.5;
                break;

            case 'c':
            case 'C':
                i = 2.5;
                break;

            default:
                i = 0.5;
        }
        System.out.println(i);
    }
}
