//* Q2. Declare char grade = 'A'. Use switch to print: A = Excellent, B = Good, C = Average, D = Pass,
// default = Invalid.

public class switch_Q2 {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
