
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;


        String longestName = "";
        int longestNameInt = 0;
        int yearSum = 0;
        int totalEntries = 0;

        while (true) {
            input = scanner.nextLine();

            if (input.isEmpty()) break;

            int year = Integer.parseInt(input.split(",")[1]);
            String name = input.split(",")[0];

            if (name.length() > longestNameInt) {
                longestNameInt = name.length();
                longestName = name;
            }

            yearSum += year;
            totalEntries++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) yearSum/totalEntries));
    }
}
