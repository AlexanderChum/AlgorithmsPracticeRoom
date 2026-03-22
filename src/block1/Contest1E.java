package block1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest1E {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = reader.readLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (String s : words) {
            StringBuilder word = new StringBuilder(s);
            int counter = 0;
            for (int letterAt = 0; letterAt < s.length(); letterAt++) {
                if (s.charAt(letterAt) == '\'') {
                    counter++;
                } else {
                    break;
                }
            }
            word.delete(0, 2 * counter);
            counter = 0;
            for (int letterAt = 0; letterAt < word.length(); letterAt++) {
                if (word.charAt(letterAt) == '\'') {
                    counter++;
                }
            }
            word.delete(word.length() - (2 * counter), word.length());
            result.append(word);
        }

        System.out.println(result);

        reader.close();
    }
}
