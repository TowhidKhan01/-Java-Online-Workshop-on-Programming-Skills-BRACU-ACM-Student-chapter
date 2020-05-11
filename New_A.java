package workshop.pkg02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class New_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            while (arr[i] > 0) {
                if ((arr[i] % 10) % 7 == 0 || (arr[i] % 10) % 4 == 0) {

                    c++;
                }
                arr[i] = arr[i] / 10;
            }
            if (c <= k) {
                count++;
            }
        }
        System.out.println(count);

    }

}
