package week1;
public class PrintMyName {
    public static void main(String[] args) {
        String name = "Abdussalam"; // replace with your actual name
        int length = name.length();
        
        // Print top border
        for (int i = 0; i < length + 4; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        // Print name with borders
        System.out.println("* " + name + " *");
        
        // Print bottom border
        for (int i = 0; i < length + 4; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
