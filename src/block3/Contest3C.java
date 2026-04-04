package block3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Contest3C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        Map<String, Integer> painted = new HashMap<>();
        int x = 0;
        int y = 0;
        painted.put(x + "," + y, 1);

        for (char letter : line.toCharArray()) {
            switch (letter) {
                case 'U' : y++; break;
                case 'D' : y--; break;
                case 'R' : x++; break;
                case 'L' : x--; break;
            }
            painted.put(x + "," + y, painted.getOrDefault(x + "," + y, 0) + 1);
        }

        int result = 0;
        for (int counter : painted.values()) {
            if (counter > 1) result++;
        }
        System.out.println(result);
        reader.close();
    }
}
