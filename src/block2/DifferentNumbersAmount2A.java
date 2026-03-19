package block2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DifferentNumbersAmount2A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Set<Integer> result = new HashSet<>();

        StringTokenizer st = new StringTokenizer(line);
        while (st.hasMoreTokens()) {
            result.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(result.size());

        reader.close();
    }
}
