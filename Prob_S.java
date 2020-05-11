
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_S {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String T = br.readLine();
        int t = Integer.parseInt(T);
        while (t > 0) {
            String s = br.readLine();
            String[] ar = s.split(" ");

            int a = Integer.parseInt(ar[0]);
            int b = Integer.parseInt(ar[1]);
            if (a % b == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - (a % b));
            }
            
        }
    }
}
