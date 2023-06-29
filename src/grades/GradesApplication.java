package grades;
import java.util.HashMap;
public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        // populate the students map with data, e.g.


        Student Student1 = new Student();
        Student1.setName("Max Payne");
        Student1.setGradeAverage("A");
        Student student1 = null;
        students.put("max123", student1);

        Student Student2 = new Student();
        Student2.setName("Betty White");
        Student2.setGradeAverage("A");
        Student student2 = null;
        students.put("betty000", student2);


        Student Student3 = new Student();
        Student3.setName("Will Smith");
        Student3.setGradeAverage("B");
        Student student3 = null;
        students.put("willyboy123", student3);{
        }

        // iterate over the students map and print details
        for (String username : students.keySet()) {
            System.out.println("Username: " + username);
            Student student = students.get(username);
            System.out.println("Name: " + student.getName());
            System.out.println("Grades: " + student.getGradeAverage());
            System.out.println();
        }




    }
}
