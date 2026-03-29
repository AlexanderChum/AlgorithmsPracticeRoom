package block2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest2E {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int[] counter = new int[10];
        int numbersSum = 0;

        for (char letter : s.toCharArray()) {
            int number = letter - '0';
            counter[number]++;
            numbersSum += number;
        }

        if (numbersSum % 3 == 1) {
            boolean removed = false;
            for (int i = 1; i <= 9; i += 3) {
                if (counter[i] > 0) {
                    counter[i]--;
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                int remainder = 2;
                for (int i = 2; i <= 9 && remainder > 0; i += 3) {
                    while (counter[i] > 0 && remainder > 0) {
                        counter[i]--;
                        remainder--;
                    }
                }
            }
        } else if (numbersSum % 3 == 2) {
            boolean removed = false;
            for (int i = 2; i <= 9; i += 3) {
                if (counter[i] > 0) {
                    counter[i]--;
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                int remainder = 2;
                for (int i = 1; i <= 9 && remainder > 0; i += 3) {
                    while (counter[i] > 0 && remainder > 0) {
                        counter[i]--;
                        remainder--;
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            result.append(String.valueOf(i).repeat(Math.max(0, counter[i])));
        }

        System.out.println(result);
        reader.close();
    }
}