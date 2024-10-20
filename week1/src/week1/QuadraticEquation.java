package week1;
import java.util.Scanner;


public class QuadraticEquation {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        
        double D = b * b - 4 * a * c;
        
        if (D < 0) {
            System.out.println("Error: Discriminant is negative, no real roots.");
        } else {
            double sqrtD = Math.sqrt(D);
            double root1 = (-b + sqrtD) / (2 * a);
            double root2 = (-b - sqrtD) / (2 * a);
            
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
        scanner.close();
    }

}
