
import static java.lang.Math.acos;
import java.util.Scanner;

public class ProbK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            double r = sc.nextDouble();
            double carea = 2 * acos(0.0) * r * r;
            double sarea = (2 * r) * (2 * r);
            double area = (sarea - carea)+Math.pow(10, -9);

            System.out.printf("Case %d: %.2f\n", i, area);
        }
    }
}
