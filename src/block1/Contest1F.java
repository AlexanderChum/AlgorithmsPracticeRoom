package block1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest1F {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(reader.readLine());
        long result = Long.MAX_VALUE;
        long result1 = Long.MAX_VALUE;
        long result2 = Long.MAX_VALUE;

        for (long i = 1; i * i <= n; i++) {
            long rows = (n + i - 1) / i;
            result1 = Math.min(result1, Math.abs(i - rows));
        }

        for (long j = 1; j * j <= n; j++) {
            long students = (n + j - 1) / j;
            result2 = Math.min(result2, Math.abs(j - students));
        }

        System.out.println(Math.min(result1, result2));

        reader.close();
    }
}