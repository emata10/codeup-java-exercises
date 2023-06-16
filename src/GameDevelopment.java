import java.util.Scanner;
import java.util.Random;

public class GameDevelopment {
    private int randomNumber;
    private int guessCount;
    private int maxGuesses;

    public GameDevelopment() {
        randomNumber = new Random().nextInt(100) + 1;
        guessCount = 0;
        maxGuesses = 10; // Change this value to set an upper limit on the number of guesses
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the High-Low game!");

        while (guessCount < maxGuesses) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess < randomNumber) {
                System.out.println("HIGHER");
            } else if (guess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
                break;
            }
        }

        if (guessCount == maxGuesses) {
            System.out.println("Out of guesses! The number was: " + randomNumber);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        GameDevelopment game = new GameDevelopment();
        game.play();
    }
}