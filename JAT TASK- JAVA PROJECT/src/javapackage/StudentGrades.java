package javapackage;
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();
         String grade=null;
        if (score >= 99 && score <= 100) {
        	 grade = "S";
        }
       if (score >= 90 && score <=99 ) {
            grade = "A";
        } else if (score >= 80 && score < 89) {
            grade = "B";
        } else if (score >= 70 && score < 79) {
            grade = "C";
        } else if (score >= 60 && score < 69) {
            grade = "D";
        } else if (score >= 50 && score < 59) {
            grade = "E";
        } else if (score >= 0 && score < 50) {
            grade = "F";
        } else if(score>100) {
        	
            grade = "Invalid score";
        }

        if (score >= 0 && score <= 100) {
        	
            System.out.println("The grade is: " + grade);
            
        } else {
            System.out.println(grade);
        }
       }
    }

