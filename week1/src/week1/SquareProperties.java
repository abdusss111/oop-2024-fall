package week1;

import java.util.Scanner;

public class SquareProperties {
    public static void main(String[] args) {
        var printer = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        double a = printer.nextDouble();
        
        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}