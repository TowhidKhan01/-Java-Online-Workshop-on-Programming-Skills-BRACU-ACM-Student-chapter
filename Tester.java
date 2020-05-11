package workshop.pkg02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
        }
    }

}
