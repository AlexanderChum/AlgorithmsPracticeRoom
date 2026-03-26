package block2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contest2A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> names = new ArrayList<>();
        Map<String, Integer> result = new HashMap<>();

        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            names.add(reader.readLine());
        }

        int m = Integer.parseInt(reader.readLine());
        int scoreBefore1 = 0, scoreBefore2 = 0;
        for (int j = 0; j < m; j++) {
            String[] line = reader.readLine().split(" ");
            String name = line[1];
            String unseparatedPoints = line[0];
            String[] pointsArray = unseparatedPoints.split(":");
            int leftScore = Integer.parseInt(pointsArray[0]);
            int rightScore = Integer.parseInt(pointsArray[1]);
            int resultScore = (leftScore - scoreBefore1) + (rightScore - scoreBefore2);
            result.put(name, result.getOrDefault(name, 0) + resultScore);
            scoreBefore1 = leftScore;
            scoreBefore2 = rightScore;
        }

        String bestName = "";
        int bestScore = 0;
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (entry.getValue() > bestScore) {
                bestScore = entry.getValue();
                bestName = entry.getKey();
            }
        }
        System.out.println(bestName + " " + bestScore);

        reader.close();
    }
}
