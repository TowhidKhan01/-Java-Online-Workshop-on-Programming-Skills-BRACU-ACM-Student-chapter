package workshopday.pkg01.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProbL {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int y[] = {0, 1, 2, 2, 1, 1, 2, 3, 3, 3, 4, 4, 4, 4, 3, 2, 1, 1, 2, 3, 4, 5, 5, 5, 5, 5};
        int x[] = {0, 1, 1, 2, 2, 3, 3, 3, 2, 1, 1, 2, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1};
        String in = br.readLine();
        int input = Integer.parseInt(in);
        for (int i = 0; i < input; i++) {
            String n = br.readLine();
            int num = Integer.parseInt(n);
            if (num > 25) {
                int index = num % 25;
                if (index > 0) {
                    System.out.println("Case " + (i + 1) + ": " + x[index] + " " + y[index]);
                } else {
                    System.out.println("Case " + (i + 1) + ": " + x[25] + " " + y[25]);
                }
            } else {
                System.out.println("Case " + (i + 1) + ": " + x[num] + " " + y[num]);

            }

        }
    }
}
