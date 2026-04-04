package block3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest3D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int cases = Integer.parseInt(reader.readLine());
        for (int i = 0; i < cases; i++) {
            String[] line = reader.readLine().split(" ");
            long n = Long.parseLong(line[0]);
            long d = Long.parseLong(line[1]);
            long sumOfPrefixes = 0;
            long maxIndex = 0;

            for (int j = 1; j <= n; j++) {
                line = reader.readLine().split(" ");
                long t = Long.parseLong(line[0]);
                long k = Long.parseLong(line[1]);

                if (sumOfPrefixes + d > t) {
                    maxIndex = j;
                }
                sumOfPrefixes += k;
            }

            result.append((maxIndex + 1)).append("\n");
        }

        System.out.println(result);
        reader.close();
    }
}
