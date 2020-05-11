package workshopday.pkg01.contest;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class prb_O {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        System.out.println(c.contains("0000000") || c.contains("1111111") ? "YES" : "NO");
    }
}
