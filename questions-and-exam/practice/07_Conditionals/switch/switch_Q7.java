//* Q7. Declare int score = 85. Switch on score / 10 to print a letter grade: 10 or 9 = A, 8 = B, 7 = C, 6 = D,
// else = F.

public class switch_Q7 {
    public static void main(String[] args) {
        int score = 85;

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;

            case 8:
                System.out.println("Grade B");
                break;

            case 7:
                System.out.println("Grade C");
                break;

            case 6:
                System.out.println("Grade D");
                break;

            default:
                System.out.println("Grade F");
        }
    }
}
