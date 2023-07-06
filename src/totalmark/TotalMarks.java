package totalmark;
//Compute Total , overall Percentage and grade of a Students Physics ,Chemistry &Maths Marks
//Grade A -80% ,Grade B -60% , Grade C -50%

import java.util.Scanner;

public class TotalMarks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter physic marks");
        int physicsmark= scanner.nextInt();
        System.out.println("Enter chemistry marks");
        int chemistrymarks= scanner.nextInt();
        System.out.println("Enter math marks");
        int mathmarks= scanner.nextInt();

        int totalMarks = physicsmark + chemistrymarks+ mathmarks;
        double percentage = (totalMarks / 300.0) * 100;
        String grade;

        if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Enter Total Marks: " + totalMarks);
        System.out.println("Overall Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
