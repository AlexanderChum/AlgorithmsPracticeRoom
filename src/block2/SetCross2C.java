package block2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class SetCross2C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = reader.readLine();
        String secondLine = reader.readLine();
        StringTokenizer st1 = new StringTokenizer(firstLine);
        StringTokenizer st2 = new StringTokenizer(secondLine);

        Set<Integer> firstSet = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        while (st1.hasMoreTokens()) {
            firstSet.add(Integer.parseInt(st1.nextToken()));
        }
        while (st2.hasMoreTokens()) {
            int number = Integer.parseInt(st2.nextToken());
            if (firstSet.contains(number)) {
                result.add(number);
            }
        }

        Collections.sort(result);

        try (FileWriter fw = new FileWriter("output.txt");
             PrintWriter pw = new PrintWriter(fw)) {
            for (int number : result) {
                pw.print(number + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        reader.close();
    }
}
