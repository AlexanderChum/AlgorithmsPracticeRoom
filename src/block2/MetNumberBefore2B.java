package block2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MetNumberBefore2B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Boolean> results = new HashMap<>();

        String line = reader.readLine();
        StringTokenizer st = new StringTokenizer(line);

        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());
            if (results.containsKey(number)) {
                System.out.println("YES");
            } else {
                results.put(number, true);
                System.out.println("NO");
            }
        }

        reader.close();
    }
}
