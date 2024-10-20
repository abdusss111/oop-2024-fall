
import week2.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        // Create a course object
        Course course = new Course("CS101", "Object-oriented Programming and Design", 3, new ArrayList<>());

        // Create a GradeBook object
        GradeBook gradeBook = new GradeBook(course);

        // Create Students and input their grades via console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input grades for students:");

        String[] studentNames = {"Student A", "Student B", "Student C", "Student D", "Student E"};
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print(studentNames[i] + ": ");
            int grade = scanner.nextInt();
            gradeBook.addStudent(new Student(i + 1, studentNames[i], grade));
        }

        gradeBook.displayMessage();
        gradeBook.displayGradeReport();
    }
}
