import java.util.Scanner;
public class MethodsExercises {
//    public static void main(String[] args) {
///////Part 1//////

//        double a = 10;
//        double b = 2.5;
//
//        double sum = addition(a, b);
//        System.out.println("Addition: " + sum);
//
//        double difference = subtraction(a, b);
//        System.out.println("Subtraction: " + difference);
//
//        double product = multiplication(a, b);
//        System.out.println("Multiplication: " + product);
//        //////////Part 2////////
//        double quotient = division(a, b);
//        System.out.println("Division: " + quotient);
//
//        double modulus = modulus(a, b);
//        System.out.println("Modulus: " + modulus);



    ////////Part 1///////
//    private static double addition(double a, double b) {
//        return a + b;
//    }
//
//    private static double subtraction(double a, double b) {
//        return a - b;
//    }
//
//    private static double multiplication(double a, double b) {
//        return a * b;
//    }
//
//    public static double division(double a, double b) {
//        if (b == 0) {
//            throw new ArithmeticException("Cannot divide by zero");
//        }
//        return a / b;
//    }
//
//    private static int modulus(double a, double b) {
//        return (int) (a % b);
//    }
//

    ////////Part Three////
//    public static int multiply(int a int b) {
//        int result = 0;
//        boolean isNegative = false;
//
//        //Handle negative numbers
//        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
//            isNegative = true;
//        }
//
//        //Convert both numbers to positive
//        a = Math.abs(a);
//        b = Math.abs(b);
//
//        ///multiplication using loop
//
//        for (int i = 0; i < b; i++) {
//            result += a;
//        }
//
//        // Check if the result should be negative
//        if (isNegative) {
//            result = -result;
//
//        }
//
//        return result;
//
//    }

///    public static  main(String[] args) {
//        int a = 5;
//        int b = 3;
//        int product = multiply(a, b);
//        System.out.println(a + " * " + b + " = " + product);
//    }



        // Method for multiplication using loop
        public static int multiplyLoop(int x, int y) {
            int product = 0;
            for (int i = 0; i < y; i++) {
                product += x;
            }
            return product;
        }

        // Method for multiplication using recursion
        public static int multiplyRecursive(int x, int y) {
            if (x == 0 || y == 0) {
                return 0;
            } else if (y > 0) {
                return x + multiplyRecursive(x, y - 1);
            } else {
                return -multiplyRecursive(x, -y);
            }
        }

        // Method for validating user input in a certain range
        public static int getInteger(int min, int max) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            int input = scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Invalid input!");
                input = getInteger(min, max); // Recursion
            }
            return input;
        }

        // Main method
        public static void main(String[] args) {
            int x = 5;
            int y = 4;

            // Multiplication using loop
            System.out.println("Using loop: " + multiplyLoop(x, y));

            // Multiplication using recursion
            System.out.println("Using recursion: " + multiplyRecursive(x, y));

            // Validating user input
            int userInput = getInteger(1, 10);
            System.out.println("User input: " + userInput);
        }
    }


