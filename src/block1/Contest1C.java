package block1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest1C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        String line = reader.readLine();

        int counter = 0;
        int result = 0;
        int switcher = 0;

        for (int i = 0; i < number; i++) {
            if (switcher == 1 && line.charAt(i) == 'a') {
                counter++;
            }
            if (switcher == -1 && line.charAt(i) == 'h') {
                counter++;
            }
            if (line.charAt(i) == 'a') {
                switcher = -1;
            }
            if (line.charAt(i) == 'h') {
                switcher = 1;
            }
            result = Math.max(result, counter);
        }
        System.out.println(result);

        reader.close();
    }
}
