//* Question 10: Simple Calculator (switch)

public class SimpleCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        String operator = "+";

        switch (operator) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    break;
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                }
            case "%":
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
