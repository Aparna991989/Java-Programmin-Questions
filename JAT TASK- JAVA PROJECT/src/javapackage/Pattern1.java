package javapackage;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int number = 1;

       
        for (int i = 1; i <= n; i++) {
        	
            for (int j = 1; j <= i; j++) {
            	
                System.out.print(number + " ");
                
                number++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
