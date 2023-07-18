package util;
import java.util.Scanner;
 public class Input {
     private Scanner scanner;

     public Input() {
         this.scanner = new Scanner(System.in);
     }

     public String getString() {
         System.out.println("Type a String...");
         return this.scanner.nextLine();
     }

     public String getString(String prompt) {
         System.out.println(prompt);
         return this.scanner.nextLine();
     }

     public Boolean yesNo() {
         System.out.println("Yes or No?");

         String userInput = this.scanner.nextLine();

         userInput = userInput.toLowerCase();

         switch (userInput) {
             case ("no"):
                 return false;
             case ("n"):
                 return false;
             case ("nope"):
                 return false;
             case ("denied"):
                 return false;
             case ("uh uh"):
                 return false;
             case ("yes"):
                 return true;
             case ("y"):
                 return true;
             case ("yep"):
                 return true;
             case ("sure"):
                 return true;
             case ("si"):
                 return true;
             case ("uh huh"):
                 return true;
             case ("approved"):
                 return true;
             case ("maybe"):
                 System.out.println("Ain't you cute?");
                 return yesNo();
             default:
                 System.out.println("Input is unacceptable");
                 return yesNo();
         }
     }

     public int getInt(int i, int i1, String s) {
         try {
             return Integer.valueOf(getString("Please enter an Int"));
         } catch (NumberFormatException e) {
             System.out.println("Hey, that's not gonna work");
             return getInt(0, 2, "Enter your choice: ");
         }
     }

     public int getInt(int min, int max) {
         System.out.println("Please enter an a number within the range");
         int userInput = this.scanner.nextInt();
         if (userInput >= min && userInput <= max) {
             return userInput;
         } else {
             return getInt(min, max);
         }
     }

     public int getHex() {
         try {
             return Integer.valueOf(getString("Please enter a hexadecimal number"));
         } catch(NumberFormatException e) {
             System.out.println("Hey that's not going to work....");
             return getInt(0, 2, "Enter your choice: ");
         }
     }

     public int getBinary() {
         try {
             return Integer.valueOf(getString("Please enter a binary number"), 2);
         } catch (NumberFormatException e) {
             System.out.println("Hey, that's not gonna work...");
             return getInt(0, 2, "Enter your choice: ");
         }
     }

     public double getDouble() {
     }
 }



