package block3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Contest3B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(reader.readLine());
        String[] lineWithTypes = reader.readLine().split(" ");

        int leftCandy = 0;
        Map<Long, Long> frequency = new HashMap<>();
        long result = 0L;

        for (int i = 0; i < n; i++) {
            long type = Long.parseLong(lineWithTypes[i]);
            frequency.put(type, frequency.getOrDefault(frequency.get(type), 0L) + 1L);

            while (frequency.size() > 2) {
                long leftType = Long.parseLong(lineWithTypes[leftCandy]);
                long counter = frequency.get(leftType);
                if ( counter == 1) {
                    frequency.remove(leftType);
                } else {
                    frequency.put(leftType, counter - 1);
                }
                leftCandy++;
            }

            if (frequency.size() == 2) {
                result = Math.max(result, i - leftCandy);
            }
        }

        System.out.println(result);

        reader.close();
    }
}
