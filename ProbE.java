
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProbE {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] a = s.split(" ");
        int n = Integer.parseInt(a[0]);
        int k = Integer.parseInt(a[1]);
        long[] arr = new long[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                arr[count] = i;
                count++;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                arr[count] = i;
                count++;
            }
        }
        System.out.println(arr[k - 1]);

    }

}
