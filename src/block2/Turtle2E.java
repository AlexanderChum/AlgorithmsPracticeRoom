package block2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Turtle2E {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        Map<Integer, Integer> truthAmount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] line = reader.readLine().split(" ");
            int number1 = Integer.parseInt(line[0]), number2 = Integer.parseInt(line[1]);
            if ((number1 + number2 == N - 1) && (number1 >= 0 && number2 >= 0) && (!truthAmount.containsKey(number1))) {
                truthAmount.put(number1, number2);
            }
        }

        System.out.println(truthAmount.size());

        reader.close();
    }
}
