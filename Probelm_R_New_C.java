
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Probelm_R_New_C {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] a = s.split(" ");
        int n = Integer.parseInt(a[0]);
        int k = Integer.parseInt(a[1]);
        int x = n + k;
        if (x % k == 0) {
            System.out.println(x);
        } else if ((n + 1) % k == 0) {
            System.out.println((n + 1));

        }
    }

}
