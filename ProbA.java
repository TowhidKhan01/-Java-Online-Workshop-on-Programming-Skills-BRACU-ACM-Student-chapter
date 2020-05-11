package workshopday.pkg01.contest;

import java.util.Scanner;

public class ProbA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 42) {
                break;
            } else {
                System.out.println(num);
            }
        }
    }
}
