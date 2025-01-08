
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        int oldest = 0;
        String oldestName = "";

        while (true) {
            input = scanner.nextLine();

            if (input.isEmpty()) break;

            int age = Integer.parseInt(input.split(",")[1]);
            String name = input.split(",")[0];

            if (age > oldest) {
                oldest = age;
                oldestName = name;
            }
        }

        System.out.println("Name of the oldeset: " + oldestName);
    }
}
