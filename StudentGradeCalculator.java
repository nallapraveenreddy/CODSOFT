import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("########Student Grade Calculator########");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of subjects:");
        int n,m;
        n = scn.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the marks out of 100 for subject-" + (i + 1) + ": ");
            m = scn.nextInt();
            if(m>=0 && m<=100){
            marks[i] = m;
            }
            else{
                System.out.println("Invalid marks!");
                marks[i]=0;
            }
        }
        int totalMarks = 0;
        for (int i = 0;i < n;i++) {
            totalMarks += marks[i];
        }
        double averagePercentage = totalMarks / (double) n;
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Results:");
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage+'%');
        System.out.println("Grade: " + grade);
    }
}
