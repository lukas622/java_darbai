import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static int RandomNumber(int number) {
        Random random = new Random();

        return random.nextInt(number);
    }

    public static void main(String[] args) {
        String[] words = {"polymorphism", "inheritance", "encapsulation", "jukebox", "strength", "quicksilver"};

        String randomWord = words[RandomNumber(words.length-1)];

        Scanner scanner = new Scanner(System.in);

        char guessedChar;


    }
}
