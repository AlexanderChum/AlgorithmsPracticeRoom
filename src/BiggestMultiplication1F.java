import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiggestMultiplication1F {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split(" ");
        int starter = Integer.parseInt(numbers[0]);
        int starter2 = Integer.parseInt(numbers[1]);
        int min1 = starter, min2 = starter2, max1 = starter, max2 = starter2;

        for (int i = 2; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            if (number > 0) {
                if (number > max1) {
                    max2 = max1;
                    max1 = number;
                } else if (number > max2) {
                    max2 = number;
                }
            }
            if (number < 0) {
                if (number < min1) {
                    min2 = min1;
                    min1 = number;
                } else if (number < min2) {
                    min2 = number;
                }
            }
        }
        if ((long) max1 * max2 > (long) min1 * min2) {
            System.out.println(Math.min(max1, max2) + " " + Math.max(max1, max2));
        } else {
            System.out.println(Math.min(min1, min2) + " " + Math.max(min1, min2));
        }

        reader.close();
    }
}