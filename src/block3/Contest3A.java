package block3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Contest3A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();

        Map<Integer, Integer> metPrefixes = new HashMap<>();
        metPrefixes.put(0,1);
        int prefix = 0;

        for (int i = 0; i < n; i++) {
            char letter = line.charAt(i);
            if (letter == 'a') {
                prefix++;
            } else {
                prefix--;
            }
            metPrefixes.put(prefix, metPrefixes.getOrDefault(prefix, 0) + 1);
        }

        long result = 0;
        for (int counter : metPrefixes.values()) {
            result += (long) counter * (counter - 1) / 2;
        }

        System.out.println(result);
        reader.close();
    }
}
