package grades;

public class StudentTest {
    public static void main(String[] args) {
        //Create to student objects
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Smith");

        //Add grades to each student

        student1.addGrade(80);
        student1.addGrade(90);
        student1.addGrade(75);

        student2.addGrade(95);
        student2.addGrade(85);
        student2.addGrade(88);

        //Retrieve and print the names and grades of each student
        System.out.println("Student 1" + student1.getName());
        System.out.println("Grades: " + student1.getGradeAverage());

        System.out.println("Student 2" + student1.getName());
        System.out.println("Grades: " + student1.getGradeAverage());
    }
}
