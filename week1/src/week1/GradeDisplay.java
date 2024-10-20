package week1;

import java.util.Scanner;

public class GradeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        
        if (score >= 95) {
            System.out.println("A");
        } else if (score >= 90) {
            System.out.println("A-");
        } else if (score >= 85) {
            System.out.println("B+");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 75) {
            System.out.println("B-");
        } else if (score >= 70) {
            System.out.println("C+");
        } else if (score >= 65) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("C-");
        } else {
            System.out.println("F");
        }
        scanner.close();

    }
}
