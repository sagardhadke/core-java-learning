//* Q6. Declare int month = 4. Use switch with fall-through grouping to print the number of days: 30-day
// months (4,6,9,11), February (2) = 28, all others = 31.

public class switch_Q6 {
    public static void main(String[] args) {
        int month = 4;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;

            case 2:
                System.out.println("28 Days");
                break;

            default:
                System.out.println("31 Days");
        }
    }
}
