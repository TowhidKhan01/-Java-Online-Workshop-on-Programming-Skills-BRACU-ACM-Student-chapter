package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class New_G {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = Integer.parseInt(s);
        while (t > 0) {
            String s1 = br.readLine();
            String[] a = s1.split(" ");
            long k = Long.parseLong(a[0]);
            int x = Integer.parseInt(a[1]);
            System.out.println((k - 1) * 9 + x);
            t--;
        }

    }
}
