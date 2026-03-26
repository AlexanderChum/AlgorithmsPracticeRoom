package block2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Contest2B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<String> words = new ArrayList<>();
        List<String> sameLetterWords = new ArrayList<>();
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < n; i++) {
            words.add(reader.readLine());
        }
        Collections.sort(words);
        int biggestNumber = Integer.MAX_VALUE;

        for (int k = 97; k <= 123; k++) {
            char letter = (char) k;
            for (String word : words) {
                if (word.charAt(0) == letter) {
                    sameLetterWords.add(word);
                }
            }
            if (!sameLetterWords.isEmpty()) {
                int resultNumber = calculate(sameLetterWords, letter);
                if (biggestNumber > resultNumber) {
                    biggestNumber = resultNumber;
                }
            }
            sameLetterWords.clear();
        }

        System.out.println(biggestNumber);

        reader.close();
    }

    private static int calculate(List<String> words, char letter) {
        Collections.sort(words);
        int counter = 0;
        String wordToCount = words.getLast();
        for (int i = 0; i < wordToCount.length(); i++) {
            if (wordToCount.charAt(i) == letter) {
                counter++;
            } else {
                break;
            }
        }
        if (counter > 1) {
            return counter;
        } else {
            return 0;
        }
    }
}
