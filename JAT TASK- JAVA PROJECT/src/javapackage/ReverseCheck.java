package javapackage;

import java.util.Scanner;

public class ReverseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Print the string in reverse order using a loop
        System.out.print("Reversed string: ");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        
        // Close the scanner
        scanner.close();
    }
}
