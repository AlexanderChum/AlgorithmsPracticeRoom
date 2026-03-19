package block1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ambulance1B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int K1 = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int K2 = Integer.parseInt(input[2]);
        int P2 = Integer.parseInt(input[3]);
        int N2 = Integer.parseInt(input[4]);

        int P1 = 0;
        int N1 = 0;

        if ((M <= 0) || (N2 > M)) {
            System.out.println("-1 -1");
            return;
        }

        boolean possibleFlatsOnFloor = false;
        boolean possibleP = false;
        boolean possibleN = false;
        int firstP1 = -1, firstN1 = -1;

        for (int i = 1; i <= 1000000; i++) {
            int calcP2 = (K2 - 1) / (M * i) + 1;
            int remainder = (K2 - 1) % (M * i);
            int calcN2 = remainder / i + 1;

            if (calcP2 == P2 && calcN2 == N2) {
                int calcP1 = (K1 - 1) / (M * i) + 1;
                int remainderK1 = (K1 - 1) % (M * i);
                int calcN1 = remainderK1 / i + 1;

                if (!possibleFlatsOnFloor) {
                    firstP1 = calcP1;
                    firstN1 = calcN1;
                    possibleFlatsOnFloor = true;
                } else {
                    if (calcP1 != firstP1) {
                        possibleP = true;
                    }
                    if (calcN1 != firstN1) {
                        possibleN = true;
                    }
                }
            }
        }

        if (!possibleFlatsOnFloor) {
            System.out.println("-1 -1");
        } else {
            if (!possibleP) {
                P1 = firstP1;
            }
            if (!possibleN) {
                N1 = firstN1;
            }

            System.out.println(P1 + " " + N1);
        }
    }
}