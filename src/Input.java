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

    public static double getDouble(){
        while(true) {
            try {
                String input = getString();
                return Double.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter double.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        int num = Input.getInt();
        System.out.println("Enter integer: " + num);

        System.out.println("Enter a double: ");
        double value = getDouble();
        System.out.println("Entered double: " + value);
    }
}


