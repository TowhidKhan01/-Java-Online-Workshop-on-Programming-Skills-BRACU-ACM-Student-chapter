package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class New_F {
    
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        int[] arr = new int[num + 1];
        int count = 0;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (arr[j] == 0 && i % j == 0) {
                    arr[i]++;
                }
            }
            if (arr[i] == 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
