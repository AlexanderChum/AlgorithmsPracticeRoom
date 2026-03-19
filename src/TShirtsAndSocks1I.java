import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TShirtsAndSocks1I {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long A = Long.parseLong(reader.readLine());
        long B = Long.parseLong(reader.readLine());
        long C = Long.parseLong(reader.readLine());
        long D = Long.parseLong(reader.readLine());

        long M = 0;
        long N = 0;

        if (A == 0) {
            print(1, C + 1);
            return;
        }
        if (B == 0) {
            print(1, D + 1);
            return;
        }
        if (C == 0) {
            print(A + 1, 1);
            return;
        }
        if (D == 0) {
            print(B + 1, 1);
            return;
        }

        long[] possibleM = {1, A + 1, B + 1};
        long[] possibleN = {1, C + 1, D + 1};
        long bestSum = Long.MAX_VALUE;

        for (long m : possibleM) {
            for (long n : possibleN) {
                if (m == 1 && n == 1) continue;
                boolean state1 = (m > A) || (n > D);
                boolean state2 = (m > B) || (n > C);
                if (state1 && state2) {
                    long sum = m + n;
                    if (sum < bestSum) {
                        bestSum = sum;
                        M = m;
                        N = n;
                    }
                }
            }
        }
        print(M, N);
    }

    public static void print(long x1, long x2) {
        System.out.println(x1 + " " + x2);
    }
}