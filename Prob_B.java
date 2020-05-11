package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long t = Long.parseLong(s);
        while (t > 0) {
            String l = br.readLine();
            long n = Long.parseLong(l);
            int count = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    count += i;
                }
            }
            System.out.println(count);
            t--;
        }

    }
}
