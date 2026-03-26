package block2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SynonymsVocabulary2F {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> vocabulary = new HashMap<>();
        Map<String, String> reverseVocabulary = new HashMap<>();

        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            String[] line = reader.readLine().split(" ");
            String first = line[0];
            String second = line[1];
            if (!vocabulary.containsKey(first) && !vocabulary.containsValue(second)) {
                vocabulary.put(first, second);
            }
            if (!reverseVocabulary.containsKey(first) && !reverseVocabulary.containsValue(second)) {
                reverseVocabulary.put(second, first);
            }
        }

        String lastWord = reader.readLine();
        if (vocabulary.containsKey(lastWord)) {
            System.out.println(vocabulary.get(lastWord));
        }
        if (reverseVocabulary.containsKey(lastWord)) {
            System.out.println(reverseVocabulary.get(lastWord));
        }

        reader.close();
    }
}
