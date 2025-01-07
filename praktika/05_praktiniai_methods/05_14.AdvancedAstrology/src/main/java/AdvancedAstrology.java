
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");

            if (i == number) {
                System.out.print("\n");
            }
        }
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int margin = 0;
        int stars = 0;

        for (int i = 1; i <= height; i++) {
            if (i > 1) margin++;

            printSpaces(height-i);
            printStars(i+margin);

            stars = i+margin;
        }

        printSpaces((stars/2)-1);
        printStars(3);
        printSpaces((stars/2)-1);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
