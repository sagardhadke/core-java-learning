package if_else_switch_7;

//* Question 4: Greater of Two Numbers

public class GreaterOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else if (num1 == num2) {
            System.out.println("Both Are Equal");
        } else {
            System.out.println(num2 + " is greater");
        }
    }
}
