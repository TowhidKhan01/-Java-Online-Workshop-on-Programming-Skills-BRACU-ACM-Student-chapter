package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProbLem_F {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            int num = Integer.parseInt(s);
            if (num == 0) {
                break;
            }
            boolean[] bool = new boolean[num + 1];
            for (int i = 0; i < bool.length; i++) {
                bool[i] = true;
            }
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (bool[i] == true) {
                    for (int j = (i * i); j < num; j = j + i) {
                        bool[j] = false;
                    }
                }
            }
            if (num >= 4) {
                for (int i = 2; i < bool.length; i++) {
                    for (int j = 2 + 1; j < bool.length; j++) {
                        if (bool[i] == true && (i % 2 == 1) && (j % 2 == 1)) {
                            if (i + j == num) {
                                
                                System.out.println(num + "=" + i + "+" + j);
                                //return;
                            }
                        }
                    }
                }
            }

        }

    }
}
