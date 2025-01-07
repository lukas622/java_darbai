
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");

        String s = scan.nextLine();

        System.out.println("Give an integer:");

        int i = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");

        double d = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");

        boolean b = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string " + s + "\nYou gave the integer " + Integer.toString(i) + "\nYou gave the double " + Double.toString(d) + "\nYou gave the boolean " + Boolean.toString(b));
    }
}
