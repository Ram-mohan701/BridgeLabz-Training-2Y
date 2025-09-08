package String;

import java.util.Scanner;

public class Index {

    // Method to deliberately generate ArrayIndexOutOfBoundsException
    static void generateException(String[] names) {
        // Ye line hamesha galat index access karegi
        System.out.println(names[names.length]);  
    }

    // Method to handle the exception properly
    static void handleException(String[] names) {
        try {
            // Try to access invalid index
            System.out.println(names[names.length]);  
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("\n--- Testing generateException (abrupt stop) ---");
        // Agar ye call karoge to program crash ho jayega
        // generateException(names);

        System.out.println("\n--- Testing handleException (safe) ---");
        handleException(names);

}
}
