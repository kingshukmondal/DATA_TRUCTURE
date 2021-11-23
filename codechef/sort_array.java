import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sort_array {
    public static void main(String[] args) {
        int checker[] = new int[256];
        Arrays.fill(checker, 0);
        int array[] = new int[50];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            checker[array[i]]++;
        }

        HashMap<Integer, Integer> has = new HashMap<>();

        for (int i = 0; i < checker.length; i++) {
            if (checker[i] != 0) {
                has.put(i, checker[i]);
            }
        }

        for(Map.Entry m:has.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }




    }
}
