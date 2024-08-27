package task2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Enter The No. of Subjects ");
       int subjects = s.nextInt();
       int marks;
       int totalMarks = 0;
       double avgpercentage;
       String grade="";
       for(int i = 1;i<=subjects;i++){
           System.out.println("Enter the No. "+i+" "+"Subject Marks");
           marks = s.nextInt();
           if(marks>100){
               System.out.println("less than 100 marks are allowed");
               return;
           }
           totalMarks = totalMarks + marks;
       }
       
       avgpercentage =  (double)totalMarks /(subjects* 100)*100;
       if(avgpercentage>=90)
           grade = "A";
       else if(avgpercentage>=80)
           grade = "B";
       else if(avgpercentage>=70)
           grade = "C";
       else if(avgpercentage>=60)
           grade = "D";
       else 
           grade = "F";
       
        System.out.println("Total Marks "+totalMarks);
        System.out.println(String.format("Average Percentage %.2f ", avgpercentage));
        System.out.println("Grade "+grade);
      
     
       
    }
    
}
