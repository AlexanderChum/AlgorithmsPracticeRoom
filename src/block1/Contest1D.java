package block1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest1D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split(" ");
        double n = Double.parseDouble(numbers[0]);
        double m = Double.parseDouble(numbers[1]);
        double h = Double.parseDouble(numbers[2]);
        double w = Double.parseDouble(numbers[3]);

        int result = Math.min(calculate(n, m, h, w), calculate(n, m, w, h));

        System.out.println(result);

        reader.close();
    }

    public static int calculate(double n, double m, double h, double w) {
        int result = Integer.MAX_VALUE;

        for (int addSgibiN = 0; addSgibiN <= 100; addSgibiN++) {
            double nMemory = n;
            int counterN = 0;
            while (counterN < addSgibiN) {
                nMemory /= 2;
                counterN++;
            }

            if (nMemory <= h) {
                double mMemory = m;
                int counterM = 0;
                while (mMemory > w) {
                    mMemory /= 2;
                    counterM++;
                    if (counterM > 100) break;
                }

                if (mMemory <= w) {
                    result = Math.min(result, counterN + counterM);
                }
            }
        }

        if (result == Integer.MAX_VALUE) {
            return 0;
        } else {
            return result;
        }
    }
}