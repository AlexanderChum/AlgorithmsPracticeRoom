package block2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Polyglots2D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> languages = new HashMap<>();

        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            int languagesAmount = Integer.parseInt(reader.readLine());
            for (int j = 0; j < languagesAmount; j++) {
                String language = reader.readLine();
                if (languages.containsKey(language)) {
                    languages.put(language, languages.get(language) + 1);
                } else {
                    languages.put(language, 1);
                }
            }
        }

        int languagesCounter = 0;
        List<String> listOfLanguages = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : languages.entrySet()) {
            if (entry.getValue().equals(N)) {
                listOfLanguages.add(entry.getKey());
                languagesCounter++;
            }
        }
        System.out.println(languagesCounter);
        System.out.println(String.join("\n", listOfLanguages));
        System.out.println(languages.size());
        System.out.println(String.join("\n",languages.keySet()));


        reader.close();
    }
}
