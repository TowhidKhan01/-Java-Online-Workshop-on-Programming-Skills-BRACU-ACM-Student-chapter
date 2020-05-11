package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class New_E {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        if (num > 11) {
            if (num % 2 == 0) {
                System.out.println("4" + " " + (num - 4));
            } else {
                System.out.println("9" + " " + (num - 9));
            }
        } 
        
    }
}
