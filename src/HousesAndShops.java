import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HousesAndShops {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split(" ");
        int biggestPath = 0;
        int counter = 1;
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(numbers[i]);
            if (number == 1) {
                while (true) {
                    if (i + counter < 10) {
                        if (Integer.parseInt(numbers[i + counter]) == 2) {
                            if (biggestPath < counter) {
                                biggestPath = counter;
                            }
                            break;
                        }
                    }
                    if (i - counter >= 0) {
                        if (Integer.parseInt(numbers[i - counter]) == 2) {
                            if (biggestPath < counter) {
                                biggestPath = counter;
                            }
                            break;
                        }
                    }
                    counter++;
                }
                counter = 1;
            }
        }
        System.out.println(biggestPath);
        reader.close();
    }
}
