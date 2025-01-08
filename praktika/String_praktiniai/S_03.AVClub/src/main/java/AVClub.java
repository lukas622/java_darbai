
import java.util.Arrays;
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] words = {};

        while (true) {
            input = scanner.nextLine();

            if (input.isEmpty()) break;

            words = input.split(" ");

            for (String word : words) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
