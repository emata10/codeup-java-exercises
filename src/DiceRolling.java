import java.util.Scanner;
public class DiceRolling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRolling = true;

        while (continueRolling) {
            System.out.print("Enter the number of sides for a pair of dice: ");
            int numSides = scanner.nextInt();

            int roll1 = rollDice(numSides);
            int roll2 = rollDice(numSides);

            System.out.println("Roll 1: " + roll1);
            System.out.println("Roll 2: " + roll2);

            System.out.print("Do you want to roll the dice again? (Y/N): ");
            String choice = scanner.next();

            continueRolling = choice.equalsIgnoreCase("Y");
            System.out.println();
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }

    public static int rollDice(int numSides) {
        return (int) (Math.random() * numSides) + 1;
    }
}

