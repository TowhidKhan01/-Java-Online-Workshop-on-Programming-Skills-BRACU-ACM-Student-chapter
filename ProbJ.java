
import java.util.Scanner;

public class ProbJ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int count = 1;
            int n = sc.nextInt();
            for (int j = 1; j <= n; j++) {
                count = count * j;
            }
            System.out.println(count);
        }
    }
}
