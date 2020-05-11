package workshop.pkg02;

import java.util.Arrays;
import java.util.Scanner;

public class problem_M {

    public static void main(String[] args){
        /**
         * BufferedReader br = new BufferedReader(new
         * InputStreamReader(System.in)); String s = br.readLine(); int size =
         * Integer.parseInt(s); int[] arr = new int[size]; for (int i = 0; i <
         * size; i++) { arr[i] = Integer.parseInt(br.readLine()); }
         *
         */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int x = arr[size - 1];
        int y = 1;
        for (int j = size - 1; j >= 1; j--) {
            if (arr[j] == arr[j - 1]) {
                y = arr[j];
                break;
            } else if (x % arr[j] != 0) {
                y = arr[j];
                break;
            }
        }
        System.out.println(x + " " + y);

    }
}
