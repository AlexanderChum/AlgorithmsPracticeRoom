import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreePainting1A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        String[] numbers = input.split(" ");

        int P = Integer.parseInt(numbers[0]);
        int V = Integer.parseInt(numbers[1]);

        input = reader.readLine();
        numbers = input.split(" ");

        int Q = Integer.parseInt(numbers[0]);
        int M = Integer.parseInt(numbers[1]);

        int counter = 0;
        int result = 0;

        if ((P - V) < (Q - M)) {
            for (int i = (P - V); i <= (P + V); i++) {
                if ((i >= (Q - M)) && (i <= (Q + M))) {
                    counter++;
                }
            }
        } else {
            for (int i = (Q - M); i <= (Q + M); i++) {
                if ((i >= (P - V)) && (i <= (P + V))) {
                    counter++;
                }
            }
        }

        result = 2 * M + 2 * V + 2 - counter;

        System.out.println(result);

        reader.close();
    }
}
