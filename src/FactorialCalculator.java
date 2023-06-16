import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            int number;
            long factorial = 1;

            do {
                System.out.print("Enter an integer between 1 and 10: ");
                number = scanner.nextInt();
            } while (number < 1 || number > 10);

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println(number + "! = " + factorial);

            System.out.print("Do you want to continue? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));

        scanner.close();



    }
}
