package workshopday.pkg01.contest;

import java.util.Scanner;

public class problemQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        char c = s.charAt(0);
        s = s.substring(1);

        if (s.toUpperCase() == s) {
            s = s.toLowerCase();
            if (Character.toUpperCase(c) == c) {
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
        }
        System.out.println(c + s);
    }
}
