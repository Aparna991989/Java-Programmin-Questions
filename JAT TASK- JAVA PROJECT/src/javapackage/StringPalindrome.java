 package javapackage;
 
 import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String originalString = scanner.nextLine();

        String cleanedString = originalString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedString = new StringBuilder(cleanedString).reverse().toString();

        if (cleanedString.equals(reversedString)) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }
    }
}
