
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");

        int days = Integer.parseInt(scanner.nextLine());

        int hours = days * 24;

        int minutes = hours * 60;

        int seconds = minutes * 60;

        System.out.println(seconds);
    }
}
