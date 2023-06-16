public class JavaLectures {
    public static void main(String[] args) {
        //June 12 Java Day one

        /////////HelloWord.java///////
//        System.out.println("Hello world!");
//
//        int myFavoriteNumber = 42;
//
//        int id;
//        boolean isLoggedIn;
//        float bankAccountBalance;
//        System.out.println(myFavoriteNumber);
//
//        int theAnswer = 42;
//        String question = "What is your favorite color?";
//        String myString = "Hello World";

//        .sout
       // System.out.println(question);
//        .soutv
       // System.out.println("theAnswer = " + theAnswer);
//        System.out.println("myString = " + myString);
//
//        double pi = 3.14159;
//        System.out.println("pi = " + pi);
//        int almostPi = (int) pi;
//        System.out.println("almostPi = " + almostPi);
//        float myNumber = (float) 3.14;

//        float myNumber = 3.14F;

//        double myNumber = 3.14;

//        System.out.println("myNumber = " + myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        int theNumberThree = 3;
//        Object o = theNumberThree;
//        System.out.println("o = " + o);
//        int three = (int) o;

//        System.out.println("three = " + three);

//        int x = 4;
//        x = x + 5;
//        x += 5;
//
//        System.out.println("x = " + x);

//        int x = 3;
//        int y = 4;

//        y = y * x;

//        y *= x;
//
//        System.out.println("y = " + y);

//        int x = 10;
//        int y = 2;

//        x = x / y;
//        x /= y;
//        System.out.println(x);

//        y = y - x;

//        y -= x;
//
//        System.out.println(y);

//        byte myByte = 127;
//        System.out.println("myByte = " + myByte);
//
//        myByte++;

//        System.out.println("myByte = " + myByte);


        //June 13 ConsoleExercises///////////////////////////
        /////////////////////ConsoleExercises.java///////
//        import java.util.Scanner;
//
//        public class ConsoleExercises {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);

//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %.2f %n", pi);
//
//        System.out.println("Please enter an Integer");

//        int userInput = scanner.nextInt();
//
//        System.out.println("User entered: " + userInput);
//
//        System.out.println("Please enter three words");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//
//        System.out.println("wordOne = " + wordOne);
//        System.out.println("wordTwo = " + wordTwo);
//        System.out.println("wordThree = " + wordThree);


//        String sentence = scanner.next();
//        scanner.nextLine();
//
//        System.out.println("Please enter a sentence");
//
//        String sentence = scanner.nextLine();
//
//        System.out.println("sentence = " + sentence);


//        Double.parseDouble("somestring");
//        Float.parseFloat("somestring");

//                System.out.println("Please enter an integer width");
//
//                String userInput1 = scanner.nextLine();
//
//                int width = Integer.parseInt(userInput1);
//
//                System.out.println("Please enter an integer height");
//
//                String userInput2 = scanner.nextLine();
//
//                int height = Integer.parseInt(userInput2);
//
//                int area = width * height;
//
//                int perimeter = 2 * (width + height);
//
//                System.out.println("Area is equal to: " + area);
//
//                System.out.printf("Perimeter is equal to : %s", perimeter);
//
//
//            }
//        }

        //June 13 part two////////////////
        ///////////ConsoleIO.Java////////////////////////

//        public static void main(String[] args) {

//        String name = "codeup";
//        System.out.println(name);
//        System.out.print(name);
//        System.out.print(name);
//        System.out.print(name);

//        System.out.printf("Hello there, %s. Nice to see you.%n", name);
//
//        System.out.println("Hello there, " + name + " Nice to see you.");

//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s! %n", greeting, name);
//        System.out.printf("%s, %s!",name , greeting);

//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Enter something: ");
//            String userInput = scanner.nextLine();
//
//            System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//
//            System.out.print("Enter something again: ");
//            String userInput2 = scanner.nextLine();
//
//            System.out.println("You entered: --> \"" + userInput2 + "\" <--");
//
//
//        }
//    }

        //////June 14 ControlFlowExercises.Java//////

//  import java.util.Scanner;
//
//        public class ControlFlowExercises {
//            public static void main(String[] args) {
//                int i = 5;
//                while (i <= 15) {
//                    System.out.print(i + " ");
//                    i++;
//                }
//
//                System.out.println();
//                i = 0;
//
//                do {
//                    System.out.println(i);
//                    i += 2;
//                } while (i <= 100);
//
//                i = 100;
//
//                do {
//                    System.out.println(i);
//                    i -= 5;
//                } while (i >= -10);
//
//                long num = 2;
//
//                do {
//                    System.out.println(num);
//                    num *= num;
//                } while (num < 1000000);
//
//                for (int j = 5; j <= 15; j++) {
//                    System.out.print(j + " ");
//                }
//                System.out.println();
//                for (int j = 0; j <= 100; j += 2) {
//                    System.out.println(j);
//                }
//                for (int j = 100; j >= -10; j -= 5) {
//                    System.out.println(j);
//                }
//                for (long b = 2; b < 1000000; b *= b) {
//                    System.out.println(b);
//                }
//
//                for (int j = 1; j < 101; j++) {
//                    if (j % 15 == 0) {
//                        System.out.println("FizzBuzz");
//                    } else if (j % 3 == 0) {
//                        System.out.println("Fizz");
//                    } else if (j % 5 == 0) {
//                        System.out.println("Buzz");
//                    } else {
//                        System.out.println(j);
//                    }
//                }
//
//                boolean userWantsContinue;
//                Scanner scan = new Scanner(System.in);
//
//                do {
//                    System.out.println("Gimme a whole number");
//                    int userNum = scan.nextInt();
//                    System.out.println("number | squared | cubed\n------ | ------- | -----");
//                    for (int j = 1; j <= userNum; j++) {
//                        System.out.printf("%-6d | %-7d | %d%n", j, j *j, j*j*j);
//                    }
//                    System.out.println("Would you like to enter another number?");
//                    scan.nextLine();
//                    String userAnswer = scan.nextLine();
//                    userWantsContinue = userAnswer.equals("yes");
//                } while (userWantsContinue);
//
//                do {
//                    System.out.println("Gimme a grade as a number");
//                    int userNum = scan.nextInt();
//                    if (userNum >= 88) {
//                        System.out.println("You gotta A!");
//                    } else if (userNum >= 80) {
//                        System.out.println("You gotta B!");
//                    } else if (userNum >= 67) {
//                        System.out.println("You gotta C!");
//                    } else if (userNum >= 60) {
//                        System.out.println("You gotta D!");
//                    } else {
//                        System.out.println("You gotta F!");
//                    }
//                    System.out.println("Would you like to enter another grade?");
//                    scan.nextLine();
//                    String userAnswer = scan.nextLine();
//                    userWantsContinue = userAnswer.equals("yes");
//                } while (userWantsContinue);
//            }
//        }

        //////June 14 ControlStatementsANDLOOPSLECTURE.Java////////////
//import java.util.Random;
//import java.util.Scanner;
//
//        public class ControlStatementsAndLoopsLecture {
//            public static void main(String[] args) {
                /* Boolean Expressions */
                // Comparison Operators
                // Let's start with what's the same...
//        System.out.println(18 > 5); // prints true
//        System.out.println(18 < 55); // prints true
//        System.out.println(18 >= 18); // prints true
//        System.out.println(18 <= 28); // prints true

                // So what's new? Java is STRICTLY typed therefore, we no longer have the idea of strict equality/identity
                // System.out.println(22 === 22); // Hypothesize: What happens when I bring this line back into the document?
//        System.out.println(22 == 22);
                // System.out.println(22 !== 34); // Hypothesize: What happens when I bring this line back into the document?
//        System.out.println(22 != 34);
                // System.out.println(18 == "18"); // Hypothesize: What happens when I bring this line back into the document?
//        System.out.println(18 == Integer.parseInt("18"));

                /* Logical Operators */
//        System.out.println(true && false); // prints false
//        System.out.println(true || false); // prints true
//        System.out.println(true & true); // prints true
//        System.out.println(false | false); // prints false
//        System.out.println(!true); // prints false

                /* String Comparison */
                // While tempting, the comparison of strings is handled differently in Java.
//                Scanner sc = new Scanner(System.in);
//        System.out.println("Type the letter y");
//        String input = sc.next();
////        boolean wasItY = input == "y"; // this becomes ???
//        boolean wasItY = input.equals("y"); // this becomes ???
//        if (wasItY) {
//            System.out.println("THAT WAS IN FACT Y");
//        } else {
//            System.out.println("THAT WAS NOT IN FACT Y. THAT WAS " + input + ".");
//        }
//
//        System.out.println("What is your favorite number?");
//        int favoriteNumber = sc.nextInt();
//
//        switch (favoriteNumber) {
//            case 1:
//                System.out.println("Player one, you're number one!!!");
//                break;
//            case 2:
//                System.out.println("Player two, you're the dude!!!");
//                break;
//            default:
//                System.out.println("I am tired of coming up with crowd chants from WWF War Zone for the PlayStation and Nintendo 64.");
//                break;
//        }
//
//        int count = 99;
//
//        while (count > 0) {
//            System.out.printf("%d bottles of root beer on the wall. %d bottles of root beer. You take one down, pass it around, %d bottles of root beer on the wall!%n", count, count, --count);
//        }
//
//        boolean signedUpForReadersDigest;
//
//        do {
//            System.out.println("Are you subscribed to Reader's Digest?");
//            signedUpForReadersDigest = sc.nextBoolean();
//        } while (!signedUpForReadersDigest);

//                int randomNum = (int) Math.floor(Math.random() * 10);
//                System.out.println(randomNum);
//                for (int i = 0; i < 10; i++) {
//                    if (i == randomNum) {
//                        System.out.println("Let's skip that number!");
//                        continue;
//                    } else if (i == randomNum + 5) {
//                        System.out.println("Alright, I'm done counting...");
//                        break;
//                    }
//                    System.out.printf("Let's count! %d%n", i);
//                }
//
//            }
//        }                    System.out.println("Would you like to enter another grade?");
//                    scan.nextLine();
//                    String userAnswer = scan.nextLine();
//                    userWantsContinue = userAnswer.equals("yes");
//                } while (userWantsContinue);
//            }
//        }

        ///////StringsLecture///////

//        import java.util.Scanner;

//        public class StringsLecture {
//            public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("type abc");
//        String userString = scanner.nextLine();
//        String str = "abc";
//        String str2 = "abc";
//        String newStr = str + "def";
//        System.out.println("abc" == "abc");
//        System.out.println(str == "abc"); // under the hood, this is happening: String@dbgdr12d == String@dbgdr12d
//        System.out.println(str == str2);
//        System.out.println(str == userString); // prints false
//        System.out.println(str.equals(userString)); // prints true, and is the preferred method of comparing Strings
//        System.out.println(newStr == "abcdef");
//
//        String jeff = "jeff";
//        String loudJeff = "JEFF";
//
//        System.out.println(jeff.equals(loudJeff)); // prints false
//        System.out.println(jeff.equalsIgnoreCase(loudJeff)); // prints true
//
//        String startsWithB = "bob";
//        String alsoStartsWithB = "barbarian";
//        System.out.println(startsWithB.startsWith("bob")); // true
//        System.out.println(alsoStartsWithB.startsWith("B")); // false

                // STRING METHOD RUN DOWN
                // charAt
//                String cosmos = "COSMOS";
//                char thirdIndex = cosmos.charAt(3);
//                System.out.println(thirdIndex);

                // indexOf
//                String mo = "MO";
//                String moe = "MOE";
//                System.out.println(cosmos.indexOf(thirdIndex));
//                System.out.println(cosmos.indexOf(mo));
//                System.out.println(cosmos.indexOf(moe));

                // length
//                System.out.println(cosmos.length());

                // replace
//                String mascot = "Codey The Duck";
//                String instructor = mascot.replace("ey The Duck", "y Hastings");
//                System.out.println(mascot);
//                System.out.println(instructor);

                // substring
//                String animal = mascot.substring(10);
//                String article = mascot.substring(6, 9);
//                System.out.println(animal);
//                System.out.println(article);

                // trim
//                String spaceyJeff = "      jeff          ";
//                System.out.println(spaceyJeff.trim());
//                System.out.println(spaceyJeff);

                // String.format
//                String name = "Joe";
//                String factory = "button";
//                String formattedStr = String.format("Hello, my name is %s, and I work in a %s factory.", name, factory);
//                System.out.println(formattedStr);
//
//            }
//        }
//

        ///////SyntaxTypesNotes///////

//        public class SyntaxTypesNotes {
//            public static void main(String[] args) {
//                System.out.println("Hello world!");
//
//
//                int id;
//                boolean isLoggedIn;
//                float bankAccountBalance;
//
//                int theAnswer = 42;
//                String question = "What is your favorite color?";

//        .sout
//                System.out.println(question);
//        .soutv
//                System.out.println("theAnswer = " + theAnswer);
//
//                double pi = 3.14159;
//                System.out.println("pi = " + pi);
//                int almostPi = (int) pi;
//                System.out.println("almostPi = " + almostPi);
//
//
//
//
//            }
//        }


        ////////MethodsLecture/////
        //June 16 //////
//        import java.util.Scanner;
//
//        public class MethodsLecture {
//            public static String sayHello(String name) {
//                return String.format("Hello, %s!", name);
//            }
//
//            public static void sayHello(int numberOfGreetings) {
//                for (int i = 0; i < numberOfGreetings; i++) {
//                    System.out.println(sayHello());
//                }
//            }
//
//            public static String sayHello() {
//                return sayHello("World");
//            }
//
//            public static void login(Scanner scanner) {
//                System.out.println("Please enter your username:");
//                String username = scanner.nextLine();
//                System.out.println("Please enter your password:");
//                String password = scanner.nextLine();
//                if (username.equalsIgnoreCase("admin") && password.equals("P@SSw0rd")) {
//                    System.out.println("Welcome to internet!");
//                } else {
//                    System.out.println("INVALID LOGIN!!!!");
//                    login(scanner);
//                }
//            }
//
//            public static void login(Scanner scanner, int attemptsLeft) {
//                if (attemptsLeft == 0) {
//                    System.out.println("NO INTERNET FOR YOU!!!");
//                } else {
//                    System.out.println("Please enter your username:");
//                    String username = scanner.nextLine();
//                    System.out.println("Please enter your password:");
//                    String password = scanner.nextLine();
//                    if (username.equalsIgnoreCase("admin") && password.equals("P@SSw0rd")) {
//                        System.out.println("Welcome to internet!");
//                    } else {
//                        System.out.println("INVALID LOGIN!!!!");
//                        login(scanner, attemptsLeft - 1);
//                    }
//                }
//            }
//
//            public static long raiseToPower(int base, int exponent) {
//                if (exponent <= 0) {
//                    return 1;
//                } else if (exponent == 1) {
//                    return base;
//                } else {
//                    return base * raiseToPower(base, exponent - 1);
//                }
//            }

//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = scanner.nextLine();
//
//        System.out.println(sayHello(name));
//        System.out.println(sayHello("David"));
//        System.out.println(sayHello());
//        sayHello(3);

//                login(scanner, 3);
//
//                System.out.println(raiseToPower(2, 2));
//                System.out.println(raiseToPower(-4, 5));
//                System.out.println(raiseToPower(2, 0));
//            }
//        }


    }
}




