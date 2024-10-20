
import week2.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeBook {
    private Course course;
    private List<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void displayGradeReport() {
        System.out.println("Class average is " + determineClassAverage());
        Student bestStudent = getBestStudent();
        Student worstStudent = getLowestStudent();
        System.out.println("Lowest grade is " + worstStudent.getGrade() + " (" + worstStudent.getName() + ")");
        System.out.println("Highest grade is " + bestStudent.getGrade() + " (" + bestStudent.getName() + ")");
        outputBarChart();
    }

    public double determineClassAverage() {
        int sum = 0;
        for (Student s : students) {
            sum += s.getGrade();
        }
        return sum / (double) students.size();
    }

    public Student getBestStudent() {
        Student best = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > best.getGrade()) {
                best = s;
            }
        }
        return best;
    }

    public Student getLowestStudent() {
        Student worst = students.get(0);
        for (Student s : students) {
            if (s.getGrade() < worst.getGrade()) {
                worst = s;
            }
        }
        return worst;
    }

    public void outputBarChart() {
        int[] gradeDistribution = new int[11];
        for (Student s : students) {
            gradeDistribution[s.getGrade() / 10]++;
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < gradeDistribution.length; i++) {
            if (i == 10) {
                System.out.print("100: ");
            } else {
                System.out.print(i * 10 + "-" + (i * 10 + 9) + ": ");
            }
            for (int j = 0; j < gradeDistribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
