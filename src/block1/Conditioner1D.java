package block1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditioner1D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split(" ");
        int troom = Integer.parseInt(numbers[0]);
        int tcond = Integer.parseInt(numbers[1]);
        String state = reader.readLine();

        switch (state) {
            case "heat":
                System.out.println(Math.max(troom, tcond));
                break;
            case "freeze":
                System.out.println(Math.min(troom, tcond));
                break;
            case "auto":
                System.out.println(tcond);
                break;
            case "fan":
                System.out.println(troom);
                break;
        }

        reader.close();
    }
}