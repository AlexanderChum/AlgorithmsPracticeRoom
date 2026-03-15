import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parallelogram1J {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputStringsAmount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < inputStringsAmount; i++){
            String[] numbers = reader.readLine().split(" ");
            int x1 = Integer.parseInt(numbers[0]);
            int y1 = Integer.parseInt(numbers[1]);
            int x2 = Integer.parseInt(numbers[2]);
            int y2 = Integer.parseInt(numbers[3]);
            int x3 = Integer.parseInt(numbers[4]);
            int y3 = Integer.parseInt(numbers[5]);
            int x4 = Integer.parseInt(numbers[6]);
            int y4 = Integer.parseInt(numbers[7]);

            if (x1 + x3 == x2 + x4 && y1 + y3 == y2 + y4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        reader.close();
    }
}
