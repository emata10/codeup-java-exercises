import java.util.Scanner;
public class MethodsExercises {

    public static final Scanner scanner = new Scanner(System.in);

    public static int addition(int x, int y) {
        return x + y;
    }
    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int divison(int x, int y) {
        return x / y;
    }

    public static int remainder(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        System.out.printf("Please enter an integer between %d and %d.%n", min, max);
        int userNum = scanner.nextInt();
        if (userNum < min || userNum > max) {
            System.out.println("Invalid input. Number out of range.");
            return getInteger(min, max);
        } else {
            System.out.println("Thank you.");
            return userNum;
        }
    }

    public static void printFactorials() {
        int userNum = getInteger(1, 10);
        for (int i = 1; i <= userNum; i++) {
            printFactorial(i);
        }
    }

    public static void printFactorial() {
        int userNum = getInteger(1, 10);
        printFactorial(userNum);
    }

    public static void printFactorial(int num) {
        String factorialButPretty = String.format("%d! = ", num);
        int factorialAnswer = 1;
        for (int i = 1; i <= num; i++) {
            factorialAnswer *= i;
            if (i == num) {
                factorialButPretty = String.format("%s%d = ", factorialButPretty, i);
            } else {
                factorialButPretty = String.format("%s%d x ", factorialButPretty, i);
            }
        }
        factorialButPretty = String.format("%s%d", factorialButPretty, factorialAnswer);
        System.out.println(factorialButPretty);
    }

    public static int rollDie(int sides) {
        return (int) Math.floor(Math.random() * sides) + 1;
    }

    public static void rollDiceGame() {
        System.out.println("How many sides are on the dice you want to roll?");
        int sides = getInteger(2, 100);
        int roll1 = rollDie(sides);
        int roll2 = rollDie(sides);
        System.out.printf("You rolled a %d and a %d, for a total of %d.%n", roll1, roll2, addition(roll1, roll2));
        System.out.println("Do you wish to roll again");
        scanner.nextLine();
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            rollDiceGame();
        }
    }

    public static void main(String[] args) {
//        System.out.println(addition(2,3));
//        System.out.println(subtraction(2,3));
//        System.out.println(multiplication(2,3));
//        System.out.println(divison(2,3));
//        System.out.println(remainder(2,3));

//        System.out.println(getInteger(1,10));

//        printFactorial(8);
//        printFactorials();

        rollDiceGame();
    }
}


