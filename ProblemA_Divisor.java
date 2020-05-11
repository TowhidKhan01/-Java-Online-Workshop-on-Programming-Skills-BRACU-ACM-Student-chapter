package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author User
 */
public class ProblemA_Divisor {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(" ");
        long n = Long.parseLong(arr[0]);
        int k = Integer.parseInt(arr[1]);
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        if (list.size() > k) {
            System.out.println(list.get(k - 1));
        } else {
            System.out.println(-1);
        }
    }

}
