package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_J {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = Integer.parseInt(s);
        while (t > 0) {
            String in = br.readLine();
            String[] a = in.split(" ");
            int x = Integer.parseInt(a[0]);
            int k = Integer.parseInt(a[1]);
            int count = 0;
            for (int i = 2; i <= x; i++) {

                if (x >= 2) {

                }
            }
            t--;
        }

    }
}
