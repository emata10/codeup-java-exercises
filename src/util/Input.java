package util;
import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static int getInt() {
        while (true) {
            try {
                String input = getString();
                return Integer.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max, String prompt) {
        int userInput;
        do {
            System.out.printf("Enter an integer between %d and %d: , min, max");
            while (!scanner.hasNextInt()) {
                String invalidInput = scanner.next();
                System.out.printf("Invalid input: %s. Please enter an integer between %d and %d: ", invalidInput, min, max);
            }
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);

        scanner.nextLine();
        return userInput;
    }

    public static int getInt(String prompt) {
        while (!scanner.hasNextInt()) {
            String invalidInput = scanner.next();
            System.out.printf("Invalid input: %s. Please enter an integer: ", invalidInput);
        }
        int userInput = scanner.nextInt();
        scanner.nextLine();
        return userInput;
    }

    public static double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.printf("Enter a number between %.1f and %.1f: ", min, max);
            while (!scanner.hasNextDouble()) {
                String invalidInput = scanner.next();
                System.out.printf("Invalid input: %s. Please enter a number between %.1f and %.1f: ", invalidInput, min, max);
            }
            userInput = scanner.nextDouble();
        } while (userInput < min || userInput > max);

        scanner.nextLine();
        return userInput;
    }

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        int num = Input.getInt();
        System.out.println("Entered integer: " + num);

        System.out.println("Enter a double: ");
        double value = Input.getDouble();
        System.out.println("Entered double: " + value);

        Input input = new Input();

        System.out.print("Enter a string: ");
        String stringInput = input.getString();
        System.out.printf("You entered: %s%n", stringInput);

        System.out.print("Enter yes/no: ");
        boolean yesNoInput = input.yesNo();
        System.out.printf("You entered: %b%n", yesNoInput);

        System.out.print("Enter an integer between 1 and 10: ");
        int intRangeInput = input.getInt(1, 10, "Enter your choice: ");
        System.out.printf("You entered: %d%n", intRangeInput);

        System.out.print("Enter an integer: ");
        int intInput = input.getInt("Enter your choice: ");
        System.out.printf("You entered: %d%n", intInput);

        System.out.print("Enter a decimal number between 1.0 and 10.0: ");
        double doubleRangeInput = input.getDouble(1.0, 10.0);

    }

    private static double getDouble() {
        return 0;
    }
}


