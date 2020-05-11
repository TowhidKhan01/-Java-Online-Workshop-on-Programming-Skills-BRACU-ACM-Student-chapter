
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class probF {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        for (int j = 0; j < n; j++) {
            String num = br.readLine();
            char[] ch = num.toCharArray();
            int count = 0;
            for (int i = 0; i < ch.length; i++) {
                if (Character.getNumericValue(ch[i]) == 4) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }

}
