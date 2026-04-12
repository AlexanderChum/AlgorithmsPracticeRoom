package block4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Contest4C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if (s.length() == 0) {
            System.out.println("YES");
            return;
        }

        int closedAmount = 0;
        for (char sign : s.toCharArray()) {
            switch (sign) {
                case '(', '{', '[': closedAmount++; break;
                case ')', ']', '}': closedAmount--; break;
            }
        }
        if (closedAmount != 0) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i) + s.substring(0, i);
            boolean correct = true;
            Stack<Character> stack = new Stack<>();
            for (char sign : substring.toCharArray()) {
                if (sign == '(' || sign == '{' || sign == '[') {
                    stack.push(sign);
                } else {
                    if (stack.isEmpty()) {
                        correct = false;
                        break;
                    }
                    char lastSing = stack.pop();
                    if (sign == ')' && lastSing != '(') {
                        correct = false;
                        break;
                    }
                    if (sign == ']' && lastSing != '[') {
                        correct = false;
                        break;
                    }
                    if (sign == '}' && lastSing != '{') {
                        correct = false;
                        break;
                    }
                }
            }
            if (correct && stack.isEmpty()) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        reader.close();
    }
}