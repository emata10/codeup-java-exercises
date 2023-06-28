package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    public ArrayList<Integer> grades;

    public Student(String name, int[] ints) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Getters and setters for name and grades properties

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);

    }

    public double getGradeAverage() {
        if (grades.isEmpty()) {
            return 0.0;//return zero if there are no grades
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();

    }

    public double getGradesAsString() {
        return getGradeAverage();
    }
}
