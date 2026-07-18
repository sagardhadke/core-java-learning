//* Q9. Declare int month = 2, year = 2024. Use switch on month. Inside case 2, use a nested if to handle
// the leap year check and print 28 or 29 days accordingly.

public class switch_Q9 {
    public static void main(String[] args) {
        int month = 2;
        int year = 2024;

        switch (month) {
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println("29 Days");
                } else {
                    System.out.println("28 Days");
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;

            default:
                System.out.println("31 Days");
        }
    }
}
