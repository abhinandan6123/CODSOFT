import java.sql.SQLOutput;
import java.util.Scanner;

class StudentGradeCalculator {

public static void main(String[] args){

Scanner sc  = new Scanner(System.in);

System.out.print("Enter no. of subjects: ");

int num_of_sub = sc.nextInt();

int TotalMarks = 0;

for(int i=1; i <= num_of_sub; i++){
System.out.print("Enter marks of sub"+i+" : ") ;

int marks = sc.nextInt() ;

TotalMarks += marks;

}

float AveragePercentage = (float) TotalMarks/num_of_sub;

String Grade;

if(AveragePercentage >=90) {

Grade = "D";

}

else if(AveragePercentage < 90 && AveragePercentage >=80) {
Grade = "E";
}
else if(AveragePercentage < 80 && AveragePercentage >=70) {
Grade = "A";
}
else if(AveragePercentage < 70 && AveragePercentage >=60) {
Grade = "B";
}
else if(AveragePercentage < 60 && AveragePercentage >=40) {
Grade = "C";
}
else{
Grade = "Fail";
}

System.out.println("Total Marks Obtained : "+TotalMarks);
System.out.println("Average Percentage Obtained :"+AveragePercentage) ;
System.out.println("Grade : "+Grade);

}
}
