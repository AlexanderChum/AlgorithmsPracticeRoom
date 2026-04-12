package block4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Contest4E {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = reader.readLine().split(" ");
        List<Integer> balls = new ArrayList<>();
        for (String s : line) {
            balls.add(Integer.parseInt(s));
        }

        int result = 0;
        boolean clourSwap;
        do {
            clourSwap = false;
            int i = 0;
            while (i < balls.size()) {
                int colour = balls.get(i);
                int j = i;
                while (j < balls.size() && balls.get(j) == colour) {
                    j++;
                }
                int chainLength = j - i;
                if (chainLength >= 3) {
                    for (int k = 0; k < chainLength; k++) {
                        balls.remove(i);
                    }
                    result += chainLength;
                    clourSwap = true;
                    break;
                } else {
                    i = j;
                }
            }
        } while (clourSwap);

        System.out.println(result);
        reader.close();
    }
}
