
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_L {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = Integer.parseInt(s);
        while (t > 0) {
            String in = br.readLine();
            String[] a = in.split(" ");
            long x = Long.parseLong(a[0]);
            long y = Long.parseLong(a[1]);
            if (x > y + 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }

}
