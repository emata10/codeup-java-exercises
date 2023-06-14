import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + "");
//            i++;
//        }
//        //Count by 2's from 0 to 100
//        int i1 = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);
//
//
//        //Cont backwards by 5's from 100 to -100
//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= -10);
//
//
//        //Display number squared while less than 1,000,000
//        int k = 2;
//        do {
//            System.out.println(k);
//            k *= 2;
//        } while (k < 1000000);
//
//
//        // Count by 2's from 0 to 100
//        for (int i2 = 0; i <= -100; i += 2) {
//            System.out.println(i);
//        }
//
//        //  Cont backwards by 5's from 100 to -10
//        for (int j1 = 100; j >= -10; j -= 5) {
//            System.out.println(j);
//        }
//
//        // Display number squared while less than 1,000,000
//        for (int k1 = 2; k < 1000000; k *= k) {
//            System.out.println(k);
//
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Scanner scnr = new Scanner(System.in);
//        int num;
//        String choice = "y";
//
//        while (choice.startsWith("y") || choice.startsWith("Y")) {
//            System.out.print("What number would you like to go up to? ");
//            num = scnr.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= num; i++) {
//                System.out.printf("%-6d | %-7d | %-5d%n", i, i * i, i * i * i);
//            }
//
//            System.out.print("Would you like to continue? (y/n)");
//            choice = scnr.next();
//        }
//        scnr.close();

        Scanner input = new Scanner(System.in);
        int numericalGrade;
        char letterGrade;
        String answer;

        do {
            System.out.print("Enter a numerical grade from 0 to 100: ");
            numericalGrade = input.nextInt();

            if (numericalGrade >= 88 && numericalGrade <= 100) {
                letterGrade = 'A';
            } else if (numericalGrade >= 80 && numericalGrade <= 87) {
                letterGrade = 'B';
            } else if (numericalGrade >= 67 && numericalGrade <= 79) {
                letterGrade = 'C';
            } else if (numericalGrade >= 60 && numericalGrade <= 66) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("The letter grade for " + numericalGrade + " is " + letterGrade);

            System.out.print("Do you want to continue? Enter Y/N: ");
            answer = input.next();
        } while (answer.equalsIgnoreCase("Y"));
    }
}












