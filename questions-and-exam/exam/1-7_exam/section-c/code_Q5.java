//* Declare int op = 3, a = 12, b = 4. Using switch-case perform: 1 = addition | 2 =
// subtraction | 3 = multiplication | 4 = division | default = Invalid Store the result in a
// variable, print it after the switch ends. Then declare int month = 4 and use a second
// switch with fall-through to print its number of days.

public class code_Q5 {
    public static void main(String[] args) {
        int op = 3, a = 12, b = 4;

        int result = 0;

        switch (op){
            case 1:
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case 2:
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case 3:
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;
            case 4:
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
                break;
            default:
                result = 0;
                System.out.println("Invalid");
        }

        System.out.println(result);

        int month = 4;

        switch (month){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case  3:
                System.out.println("Wednesday");
                break;
            case  4:
                System.out.println("Thursday");
                break;
            case  5:
                System.out.println("Friday");
                break;
            case  6:
                System.out.println("Saturday");
                break;
            case   7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;

        }
    }
}
