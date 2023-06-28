package grades;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        // Create Student objects
        Student student1 = new Student("JohnDoe", new int[]{90, 85, 95});
        Student student2 = new Student("JaneSmith", new int[]{80, 75, 90});
        Student student3 = new Student("AlexJohnson", new int[]{95, 85, 90});
        Student student4 = new Student("EmilyBrown", new int[]{70, 80, 75});
        Student student5 = new Student("Luis", new int[]{95, 92, 97});

        // Add students to the map
        students.put("johndoe123", student1);
        students.put("janesmith456", student2);
        students.put("alexjohnson789", student3);
        students.put("emilybrown999", student4);
        students.put("MontealegreLuis", student5);


        Scanner scanner = new Scanner(System.in);
        String userChoice = "yes";

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println();

        while (userChoice.equalsIgnoreCase("yes")) {
            // Print GitHub usernames
            while (userChoice.equalsIgnoreCase("yes")) {
                System.out.print("\nWhat student would you like to see more information on? ");
                String input = scanner.next();
            }

            // Ask for user input
            System.out.print("\nEnter a GitHub username to see more information: ");
            String input = scanner.next();

            if (students.containsKey(input)) {
                Student student = students.get(input);
                System.out.println("\nName: " + student.getName() + " - GitHub Username: " + input);
                System.out.println("Current Average: " + student.getGradesAsString());
            } else {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + input + "\".");
            }

            System.out.print("\nWould you like to see another student? (yes/no): ");
            userChoice = scanner.next();
        }

        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}
