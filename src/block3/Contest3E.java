package block3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest3E  {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int sumOfMarks = 0;
        int worstMark = 0;
        for (int i = 0; i < line.length(); i++) {
            int valueOfLetter = line.charAt(i) - 'A' + 1;
            sumOfMarks += valueOfLetter;
            if (valueOfLetter > worstMark) {
                worstMark = valueOfLetter;
            }
        }
        int roundToUpper = ((2 * sumOfMarks + line.length() - 1) / (2 * line.length()));
        int finalGrade = Math.max(roundToUpper, Math.max(worstMark - 1, 1));

        System.out.println((char) ('A' + finalGrade - 1));
        reader.close();
    }
}
