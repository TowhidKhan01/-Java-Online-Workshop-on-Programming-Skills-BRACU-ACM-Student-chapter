
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_Q_New_B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);

        if (num < 1) {
            System.out.println("NO");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            if (sum == num) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }

}
