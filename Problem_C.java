package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Problem_C {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int num = Integer.parseInt(s);
        //Finding Factorial
        //BigInteger f = new BigInteger("1");
        int f = 1;
        for (int i = 2; i <= num; i++) {
            // f = f.multiply(BigInteger.valueOf(i));
            f = f * i;
        }
        System.out.println("Factorial : " + f);
        boolean[] bool = new boolean[f + 1];

        for (int i = 0; i < bool.length; i++) {
            bool[i] = true;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (bool[i] == true) {
                for (int j = (i * i); j < num; j = j + i) {
                    bool[j] = false;
                }
            }
        }
        if (f > 2) {

            long count = 1;
            for (int i = 2; i <= f; i++) {
                if (bool[i] == true) {
                    if (f > 1) {
                        f = f / i;
                        i = 2;
                        count++;
                    }
                }
            }
            System.out.println("Count : " + count);
        } else {
            System.out.println(1);
        }
    }
}
