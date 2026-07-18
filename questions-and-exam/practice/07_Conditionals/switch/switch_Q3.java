//* Q3. Declare int num = 2. Use switch to print: 1 = 'One', 2 = 'Two', 3 = 'Three', default = 'Other'.

public class switch_Q3 {
    public static void main(String[] args) {
        int num = 2;

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }
    }
}
