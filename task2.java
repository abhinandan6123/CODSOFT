package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of subjects:");
        int subjects = s.nextInt();
        
        int marks;
        int totalMarks = 0;
        double avgPercentage;
        String grade = "";
        
        for (int i = 1; i <= subjects; i++) {
            System.out.println("Enter the marks for subject " + i + ":");
            marks = s.nextInt();
            
            if (marks > 100) {
                System.out.println("Marks cannot exceed 100. Exiting...");
                s.close();
                return;
            }
            
            totalMarks += marks;
        }
        
        avgPercentage = (double) totalMarks / (subjects * 100) * 100;
        
        if (avgPercentage >= 85) {
            grade = "A";
        } else if (avgPercentage >= 75) {
            grade = "B";
        } else if (avgPercentage >= 65) {
            grade = "C";
        } else if (avgPercentage >= 55) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println(String.format("Average Percentage: %.2f", avgPercentage));
        System.out.println("Grade: " + grade);
        
        s.close();
    }
}
