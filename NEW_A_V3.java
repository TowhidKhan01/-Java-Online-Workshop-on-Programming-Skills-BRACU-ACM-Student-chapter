package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NEW_A_V3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String[] a = s1.split(" ");
        int c = 0;
        int n = Integer.parseInt(a[0]);
        int k = Integer.parseInt(a[1]);
        for (int i = 0; i < n; i++) {
            int d = 0;
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '4' || s.charAt(j) == '7') {
                    d++;
                }
            }
            if (d <= k) {
                c++;
            }
        }
        System.out.println(c);
    }

}
