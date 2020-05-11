package workshopday.pkg01.contest;

import java.util.Scanner;

public class ProbC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long A, B;
            A = sc.nextLong();
            B = sc.nextLong();
            System.out.println(A % B);
        }
    }
}
