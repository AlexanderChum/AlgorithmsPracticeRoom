package block4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contest4A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = reader.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        char[][] symbols = new char[n][m];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            String inputLine = reader.readLine();
            for (int j = 0; j < m; j++) {
                symbols[i][j] = inputLine.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (symbols[i][j] == '#') {
                    int size = 1;
                    while (j + size < m && symbols[i][j + size] == '#') {
                        size++;
                    }
                    if (size > 1) {
                        counter++;
                        for (int x = i; x < i + size; x++) {
                            for (int y = j; y < j + size; y++) {
                                symbols[x][y] = '.';
                            }
                        }
                    } else {
                        counter++;
                        symbols[i][j] = '.';
                    }
                }
            }
        }

        System.out.println(counter);
        reader.close();
    }
}
