package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private HashMap<String, String> attendance;
    private String gradeAverage;

    public Student(String name) {
        this.name = name;
        HashMap<String, String> attendance1 = this.attendance;
        new HashMap<>();
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeAverage(String gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        int[] grades = new int[0];
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}