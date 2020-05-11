package workshopday.pkg01.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_M {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        long n = Long.parseLong(in);
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            long a = Long.parseLong(arr[0]);
            long b = Long.parseLong(arr[1]);
            if (a < b) {
                long c = Math.abs(b - a);
                if (c % 2 == 1) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }

            } else if (a > b) {
                long c = Math.abs(b - a);
                if (c % 2 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                System.out.println(0);
            }
        }

    }
}
