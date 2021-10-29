package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class files1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("G:\\DATA STRUCTURE\\files\\text.txt");
        Scanner sc=new Scanner(f);
        while (sc.hasNextLine())
        {
            String line =sc.nextLine();
            System.out.println(line);
        }


    }
}
