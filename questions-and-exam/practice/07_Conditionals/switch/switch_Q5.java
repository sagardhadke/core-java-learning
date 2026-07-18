//* Q5. Declare int op = 2, a = 10, b = 5. Use switch to perform: 1 = add, 2 = subtract, 3 = multiply, 4 =
// divide, default = invalid. Print the result.

public class switch_Q5 {
    public static void main(String[] args) {
        int op = 2;
        int a = 10;
        int b = 5;

        switch (op) {
            case 1:
                System.out.println("Addition = " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;
            case 4:
                System.out.println("Division = " + (a / b));
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
