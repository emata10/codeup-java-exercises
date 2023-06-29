package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CLI {
    @Override
    public String toString() {
        return "CLI{}";
    }

    public static void main(String[] args) {
        //Create a map of GitHub usernames and student information
        Map<String, Student> students = new HashMap<>();
        students.put("maxpayne123", new student("Max Payne", "A"));
        students.put("bettywhite123", new student("Betty White", "B"));
        students.put("boobear123", new student("Boo Bear", "C"));
        students.put("crybaby123", new student("Cry Baby", "F-"));


        // Welcome message
        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        char answer;
        do {
            System.out.println("What student would you like to see more information on?");
            String username = scanner.nextLine();

            if (students.containsKey(username)) {
                Student student = students.get(username);
                System.out.println("\nStudent Name: " + student.getName());
                System.out.println("Grades: " + student.getGrades() + "\n");
            } else {
                System.out.println("Sorry, no student found with the GitHub username of \"" + username + "\".\n");
            }

            System.out.println("Would you like to see another student? (y/n)");
            answer = scanner.nextLine().charAt(0);
        } while (answer == 'y');

        System.out.println("Thank you for using the CLI. Goodbye!");
    }

    private static class student extends Student {
        public student(String cryBaby, String s) {
            super();


        }
    }
}

public class Student {
    private String name;
    private String grades;

    public Student(String name, String grades) {
        this.name = name;
        this.grades = grades;
    }

    public Student() {

    }

    public String getGrades() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private static class student extends Student {
        public student(String maxPayne, String a) {
        }
    }
}
