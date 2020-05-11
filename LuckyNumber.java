package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//problem 122A codeForces
public class LuckyNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long num = Long.parseLong(s);
        if ((num % 7 == 0) || (num % 4 == 0) || (num % 47 == 0) || (num % 477 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
