import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Contest1B {
    static Map<Map.Entry<Integer, Integer>, Integer> events = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int m = Integer.parseInt(numbers[1]);

        QuantumEvent[] events = new QuantumEvent[(int)n];

        for (int i = 0; i < n; i++) {
            String eventParams = reader.readLine();
            String[] paramsSplit = eventParams.split(" ");

            events[i] = new QuantumEvent(
                    Long.parseLong(paramsSplit[0]),
                    Long.parseLong(paramsSplit[1]),
                    Integer.parseInt(paramsSplit[2])
            );
        }

        for (int i = 0; i < m; i++) {
            String requestedPartition = reader.readLine();
            long index = Long.parseLong(requestedPartition);
            long length = provideLength(events, index, n);
            System.out.println(length);
        }

        reader.close();
    }

    static long provideLength(QuantumEvent[] events, long index, long n) {
        long length = 0;

        for (int i = 0; i < n; i++) {
            QuantumEvent event = events[i];

            if (index < event.lowerBound || index > event.upperBound) {
                continue;
            }

            if ((index - event.lowerBound) % 2 == 0) {
                length += event.force;
            } else {
                length -= event.force;
            }
        }

        return length;
    }

    public static class QuantumEvent {
        long lowerBound;
        long upperBound;
        int force;

        public QuantumEvent(long lowerBound, long upperBound, int force) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
            this.force = force;
        }
    }
}