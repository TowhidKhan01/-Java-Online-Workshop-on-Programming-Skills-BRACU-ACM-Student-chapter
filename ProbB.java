package workshopday.pkg01.contest;

import java.util.Arrays;
import java.util.Scanner;

public class ProbB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long[] arr = new long[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = sc.nextLong();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
