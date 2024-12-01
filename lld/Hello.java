import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");

        // Read the input from the user
        String name = scanner.nextLine();

        // Print the input back to the user
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}