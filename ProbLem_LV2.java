package workshopday.pkg01.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProbLem_LV2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = Integer.parseInt(s);
        for (int i = 0; i < t; i++) {
            long row, col;
            String s1 = br.readLine();
            long in = Long.parseLong(s1);
            double r = (Math.sqrt(in));
            long root = (long) Math.ceil(r);

            long x = ((long) (root * root) - in);

            if (x < root) {
                col = root;
                row = x + 1;
            } else {
                row = root;
                //System.out.println("Row :" + row);
                col = in - (root - 1) * (root - 1);
                //System.out.println("col:" + col)
            }
            if (root % 2 == 0) {
                //System.out.println("root even");
                long temp = col;
                col = row;
                //System.out.println("col " + col);
                row = temp;
                //System.out.println("row : " + row);
            }
            System.out.println("Case " + (i + 1) + ": " + row + " " + col);

        }
    }

}
