package grades;
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", new int[]{95, 85, 90});
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(95);

        Student  student2 = new Student("Jane Smith", new int[]{95, 85, 90});
        student2.addGrade(80);
        student2.addGrade(75);
        student2.addGrade(85);

        System.out.println(student1.getName() + "'s average grade: " + student1.getGradeAverage());
        System.out.println(student2.getName() + "'s average grade: " + student2.getGradeAverage());
    }
}
