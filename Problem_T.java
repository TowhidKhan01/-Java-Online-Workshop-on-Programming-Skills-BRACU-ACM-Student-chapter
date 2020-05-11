
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_T {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] sarr = s.split(" ");
            int a, b, c;
            a = Integer.parseInt(sarr[0]);
            b = Integer.parseInt(sarr[1]);
            c = Integer.parseInt(sarr[2]);

            int sum = a + b + c;
            if (sum == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
