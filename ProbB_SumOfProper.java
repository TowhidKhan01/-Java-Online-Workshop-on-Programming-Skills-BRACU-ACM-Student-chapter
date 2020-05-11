package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProbB_SumOfProper {

    public static long sumOfPrimeDivisor(long num) {
        long result = 0;
         for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == (num / i)) {
                    result += i;
                } else {
                    result += i + num / i;
                }
            }
        }
        return (result + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long n = Long.parseLong(s);
        while (n > 0) {
            String r = br.readLine();
            long number = Long.parseLong(r);
            if (number > 1) {
                System.out.println(sumOfPrimeDivisor(number));
            } else {
                System.out.println(0);
            }
            n--;
        }

    }

}
