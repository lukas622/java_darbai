import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static int RandomNumber(int number) {
        Random random = new Random();

        return random.nextInt(number);
    }

    public static String Update(char guess, String word, String hiddenWord) {
        char[] characters = word.toCharArray();
        
    }

    public static void main(String[] args) {
        String[] words = {"polymorphism", "inheritance"};

        String randomWord = words[RandomNumber(words.length-1)];

        StringBuilder hiddenBuilder = new StringBuilder();

        for (int i = 1; i < randomWord.length(); i++) {
            hiddenBuilder.append("*");
        }

        String hiddenWord = hiddenBuilder.toString();

        Scanner scanner = new Scanner(System.in);

        char guessedChar;

        while (!randomWord.contentEquals(hiddenBuilder)) {
            System.out.print("(Guess) Enter a letter in word " + hiddenWord + " > ");

            guessedChar = scanner.nextLine().charAt(0);

            hiddenWord = Update(guessedChar, randomWord, hiddenWord);
        }
    }
}
