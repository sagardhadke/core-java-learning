// Q4. Declare int marks = 85. Nested if-else: first check if marks >= 50 (Pass). Inside the pass branch,
// check if marks >= 75 to print 'Distinction', else 'Pass'. If failed, print 'Fail'.

public class Nested_if_else_Q4 {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 50) {
            if (marks >= 75) {
                System.out.println("Distinction");
            } else {
                System.out.println("Pass");
            }
        } else {
            System.out.println("Fail");
        }
    }
}
