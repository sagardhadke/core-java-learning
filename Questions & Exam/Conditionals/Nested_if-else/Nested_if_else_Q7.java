// Q7. Declare int age = 25, int income = 45000.
// Using nested if, print 'Loan Approved' only if age >= 21
// AND income >= 30000, else print 'Loan Rejected'.

public class Nested_if_else_Q7 {
    public static void main(String[] args) {
        int age = 25;
        int income = 45000;

        if (age >= 21) {
            if (income >= 30000) {
                System.out.println("Loan Approved");
            } else {
                System.out.println("Loan Rejected");
            }
        } else {
            System.out.println("Loan Rejected");
        }
    }
}
