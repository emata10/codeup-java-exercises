package util;
import java.util.Scanner;
 public class Input {
      static Scanner scanner;

     public Input() {
         this.scanner = new Scanner(System.in);
     }

     public static String getString() {
         return scanner.nextLine();
     }

     public boolean yesNo() {

         String input = scanner.nextLine().toLowerCase();
         return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
     }

     public int getInt(int min, int max, String s) {
         int userInput;
         do {
             System.out.printf("Enter an integer between %d and %d: ", min, max);
             while (!scanner.hasNextInt()) {
                 String invalidInput = scanner.next();
                 System.out.printf("Invalid input: %s. Please enter an integer between %d and %d: ", invalidInput, min, max);
             }
             userInput = scanner.nextInt();
         } while (userInput < min || userInput > max);

         this.scanner.nextLine();
         return userInput;
     }

     public static int getInt(String s) {
         while (!scanner.hasNextInt()) {
             String invalidInput = scanner.next();
             System.out.printf("Invalid input: %s. Please enter an integer: ", invalidInput);
         }
         int userInput = scanner.nextInt();
         scanner.nextLine();
         return userInput;
     }

     public double getDouble(double min, double max) {
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

     public double getDouble() {
         while (!scanner.hasNextDouble()) {
             String invalidInput = scanner.next();
             System.out.printf("Invalid input: %s. Please enter a decimal number: ", invalidInput);
         }
         double userInput = scanner.nextDouble();
         scanner.nextLine();
         return userInput;
     }



//file: InputTest.java
     public static void main(String[] args) {
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
        System.out.printf("You entered: %.2f%n", doubleRangeInput);

        System.out.print("Enter a decimal number: ");
        double doubleInput = input.getDouble();
        System.out.printf("You entered: %.2f%n", doubleInput);
    }
}
