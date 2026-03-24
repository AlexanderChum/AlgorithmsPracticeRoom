package block2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Turtle2E {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int counter = 0;

        for (int i = 0; i < N; i++) {
            String[] line = reader.readLine().split(" ");
            if (Integer.parseInt(line[0]) + Integer.parseInt(line[1]) == N - 1) {
                counter++;
            }
        }

        System.out.println(counter);

        reader.close();
    }
}
