package block2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest2F {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String[] line = reader.readLine().split(" ");
        int[] dishes = new int[n];
        for (int i = 0; i < n; i++) {
            dishes[i] = Integer.parseInt(line[i]) - 1;
        }

        boolean[] allergy = new boolean[n];
        for (int i = 0; i < n; i++) {
            int d = (i - dishes[i]) % n;
            if (d < 0) d += n;
            allergy[d] = true;
        }

        int result = -1;
        for (int j = 0; j < n; j++) {
            if (!allergy[j]) {
                result = j;
                break;
            }
        }
        System.out.println(result);
        reader.close();
    }
}