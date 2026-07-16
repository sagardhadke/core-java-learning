package if_else_switch_7;

// Question 6: Student Grade Calculator

public class StudentGradeCalculator {
    public static void main(String[] args) {
        int marks = 82;

        if (marks >= 90) {
            System.out.println(marks + " Grade A");
        } else if (marks >= 75) {
            System.out.println(marks + " Grade B");
        } else if (marks >= 60) {
            System.out.println(marks + " Grade C");
        } else if (marks >= 40) {
            System.out.println(marks + " Grade D");
        } else if (marks < 40) {
            System.out.println(marks + " Fail");
        }
    }
}
