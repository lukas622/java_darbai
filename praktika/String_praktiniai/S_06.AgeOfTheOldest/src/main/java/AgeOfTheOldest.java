
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        int oldest = 0;

        while (true) {
            input = scanner.nextLine();

            if (input.isEmpty()) break;

            int age = Integer.parseInt(input.split(",")[1]);

            if (age > oldest) {
                oldest = age;
            }
        }

        System.out.println("Age of the oldest: " + Integer.toString(oldest));
    }
}
