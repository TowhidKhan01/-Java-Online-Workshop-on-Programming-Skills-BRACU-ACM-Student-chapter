
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class New_C {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] a = s.split(" ");
        int n = Integer.parseInt(a[0]);
        int k = Integer.parseInt(a[1]);

        if ((n + 1) % k != 0) {
            int x = n / k;
            x++;
            System.out.println(k * x);
        } else {
            System.out.println(n + 1);
        }
    }
}
