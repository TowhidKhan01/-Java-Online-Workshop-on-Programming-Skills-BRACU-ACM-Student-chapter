package workshop.pkg02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class New_AV2 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] a = s.split(" ");
        
        int n = Integer.parseInt(a[0]);
        int k = Integer.parseInt(a[1]);
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            while (arr[i] > 0) {
                if (arr[i] % 10 == 4 || arr[i] % 10 == 7) {
                    
                    c++;
                }
                arr[i] = arr[i] / 10;
            }
            if (c <= k) {
                count++;
            }
        }
        System.out.println(count);
        
    }
    
}
