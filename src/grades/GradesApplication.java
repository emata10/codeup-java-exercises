package grades;

import util.Input;

import java.util.HashMap;
public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Loki");
        Student student2 = new Student("Roxy");
        Student student3 = new Student("Nami");


        student1.addGrade(100);
        student1.addGrade(98);
        student1.addGrade(99);
        student1.addGrade(97);
        student1.addGrade(92);
        student1.addGrade(99);
        student2.addGrade(95);
        student2.addGrade(85);
        student2.addGrade(80);
        student2.addGrade(82);
        student2.addGrade(100);
        student2.addGrade(95);
        student3.addGrade(95);
        student3.addGrade(85);
        student3.addGrade(80);
        student3.addGrade(82);

       students.put("Loki", student1);
       students.put("Roxy", student2);
       students.put("Nami", student3);

    Input in = new Input();
    boolean resp = true;
    while(resp) {

        System.out.println("Welcome!/n");

        System.out.println("Here are the GitHub usernames of our students: /n" );;

        String s = "";
        for (String key : students.keySet()) {
            s += " | " + key;
        }

        System.out.println(s + " | \n");

        System.out.println("Which student would you like information about?");

        String userInput = in.getString();

        if(students.containsKey(userInput)) {

            System.out.printf("Student Name: \"%s\";%nStudent GitHub Username: \"%s\";%nStudent Grade Average: %.2f;%n", students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage());

//            students.get(userInput).getName();
//            userInput;
//            students.get(userInput).getGradeAverage();

        } else {
            System.out.println("I'm sorry, but that username is not valide.");
        }

        System.out.println("Do you wish to continue?\n");

        resp = in.yesNo();

    }
        System.out.println("Thank you have a great day!");

    }
}


