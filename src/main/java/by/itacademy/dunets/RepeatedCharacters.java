package by.itacademy.dunets;

import java.util.Scanner;

public class RepeatedCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String checked = "";

        boolean hasRepeatedChars = false;

        for (int i = 0; i < text.length(); i++) {
            if (checked.indexOf(text.charAt(i)) == -1) {
                int count = 0;

                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(i) == text.charAt(j)) {
                        count++;
                    }
                }

                checked += text.charAt(i);

                if (count > 1) {
                    hasRepeatedChars = true;
                    System.out.println("\'" + text.charAt(i) + "\' = " + count);
                }
            }
        }
        if (!hasRepeatedChars) {
            System.out.println("Повторений нет!");
        }
    }
}
