package block1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parallelogram1J {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputStringsAmount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < inputStringsAmount; i++) {
            String[] numbers = reader.readLine().split(" ");
            for (int j = 0; j < numbers.length; j++) {
                if ("".equals(numbers[j])) {
                    for (int k = j; k < numbers.length - 1; k++) {
                        numbers[k] = numbers[k + 1];
                    }
                }
            }
            int x1 = Integer.parseInt(numbers[0]);
            int y1 = Integer.parseInt(numbers[1]);
            int x2 = Integer.parseInt(numbers[2]);
            int y2 = Integer.parseInt(numbers[3]);
            int x3 = Integer.parseInt(numbers[4]);
            int y3 = Integer.parseInt(numbers[5]);
            int x4 = Integer.parseInt(numbers[6]);
            int y4 = Integer.parseInt(numbers[7]);

            boolean pChecker = false;

            if (x1 + x2 == x3 + x4 && y1 + y2 == y3 + y4) {
                pChecker = true;
            }
            if (x1 + x3 == x2 + x4 && y1 + y3 == y2 + y4) {
                pChecker = true;
            }
            if (x1 + x4 == x2 + x3 && y1 + y4 == y2 + y3) {
                pChecker = true;
            }

            if (pChecker) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        reader.close();
    }
}
