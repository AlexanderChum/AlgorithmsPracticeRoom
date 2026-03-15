import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquationWithRoots1H {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int result = 0;

        if (c < 0) {
            System.out.println("NO SOLUTION");
        } else if (a == 0) {
            if (b == Math.pow(c, 2.0)) {
                System.out.println("MANY SOLUTIONS");
            } else {
                System.out.println("NO SOLUTION");
            }
        } else {
            if (((Math.pow(c, 2.0) - b) % a) == 0) {
                result = ((int) Math.pow(c, 2.0) - b) / a;
                System.out.println(result);
            } else {
                System.out.println("NO SOLUTION");
            }
        }
        reader.close();
    }
}
