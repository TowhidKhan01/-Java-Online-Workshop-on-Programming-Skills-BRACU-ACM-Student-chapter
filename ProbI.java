
import java.util.Arrays;
import java.util.Scanner;

public class ProbI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 99 && 10 <= n) {
            String s = "" + n;
            char[] ch = s.toCharArray();
            System.out.println(Character.getNumericValue(ch[0]) + " " + Character.getNumericValue(ch[1]));
        }

    }
}
