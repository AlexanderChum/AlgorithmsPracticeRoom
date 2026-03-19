package block1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest1A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] size = reader.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);
        int counter = 0;
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = reader.readLine();
        }

        for (int i = 0; i < n; i++) {
            char[] row = strings[i].toCharArray();
            for (int j = 0; j < (m - 1); j++) {
                if (row[j] == ('.') && row[j + 1] == '.') {
                    counter++;
                }
            }
        }

        for (int i = 0; i < (n - 1); i++) {
            char[] row = strings[i].toCharArray();
            char[] nextRow = strings[i + 1].toCharArray();
            for (int j = 0; j < m; j++) {
                if (row[j] == ('.') && nextRow[j] == ('.')) {
                    counter++;
                }
            }
        }

        System.out.println(counter);

        reader.close();
    }
}
