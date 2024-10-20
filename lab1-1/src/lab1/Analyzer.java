package lab1;
import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Data data = new Data();
		
		while(true) {
            System.out.print("Enter number (Q or q to quit): ");
            String input = scanner.nextLine(); 
            
            if (input.equalsIgnoreCase("Q")) {
            	break;
            }
            try {
            	double number = Double.parseDouble(input);
            	data.addNumber(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a VALID NUMBER.");
            }
		}
		
		System.out.println("Average: " + data.getAverage());
		System.out.println("Maximum: " + data.getMax());
		System.out.println("Sum: " + data.getSum());
		scanner.close();

	}

}
