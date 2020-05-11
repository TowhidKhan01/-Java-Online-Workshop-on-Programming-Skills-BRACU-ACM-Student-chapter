
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class New_D {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        if (isPrime(num)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }

    }

}
