package workshopday.pkg01.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class ProbLem_Lv3Test {
 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = Integer.parseInt(s);
        for (int i = 0; i < t; i++) {
            long row, col;
            String s1 = br.readLine();
            long in = Long.parseLong(s1);
            double r = (Math.sqrt(in));
           long root=(long)Math.ceil(r);
           // System.out.println(root);
            long x = (long)(root * root) - in;
            if (x<root) {
 
                col = root;
                row = x + 1;
                // System.out.println(col+" "+row+" "+2);
 
 
 
 
            } else {
                row = root;
                col =in - (root - 1) * (root - 1);
                 //System.out.println(col+" "+row+" "+1);
            }
            if (root % 2 == 0) {
                long temp = col;
                col = row;
                row = temp;
 
            }
            System.out.println("Case " + (i + 1) + ": " + row + " " + col);
 
        }
    }    
}
