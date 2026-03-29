package block2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest2C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        long leftSide = -1;
        long rightSide = 1000000001;

        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            long x = Integer.parseInt(line[0]);
            long d = Integer.parseInt(line[1]);
            if (x - d > leftSide) {
                leftSide = x - d;
            }
            if (x + d < rightSide) {
                rightSide = x + d;
            }
        }

        if (leftSide <= rightSide) {
            System.out.println(rightSide);
        } else {
            System.out.println(-1);
        }

        reader.close();
    }
}
