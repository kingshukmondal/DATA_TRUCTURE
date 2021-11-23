package aapn_college;

import java.util.Scanner;
import java.util.Stack;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int cs=0;
        while (cs++<tc) {
            /*
4
8
1 2 0 7 2 0 2 0
6
4 8 15 16 23 42
9
3 1 4 1 5 9 2 6 5
6
9 9 9 9 9 9
 */

            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Stack<Integer> sta = new Stack<>();

            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                while (!sta.isEmpty() && sta.peek() < arr[i]) {
                    sta.pop();
                }
                if (sta.isEmpty()) {
                    if (arr[i] > arr[i + 1]) {
                        count++;
                    }
                }
                sta.push(arr[i]);
            }

            boolean x = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] >= arr[n - 1]) {
                    x = false;
                    break;
                }
            }
            if (x) {
                count++;
            }

            System.out.println("Case #"+cs+": "+count);
        }
    }
}