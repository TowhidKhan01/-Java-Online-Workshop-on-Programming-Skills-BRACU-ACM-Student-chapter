package workshopday.pkg01.contest;

import java.util.Scanner;

public class problem_L {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            int size = input.length();
            if (size > 10) {
                String temp = input.charAt(0) + ""+(size-2) + input.charAt(size - 1);
                System.out.println(temp);
            } else {
                System.out.println(input);
            }
        }

    }
}
