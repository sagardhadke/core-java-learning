// Q8. Declare int a = 5, b = 10. Store the result of (a < b && b < 20) in a boolean variable named result,
// then use that boolean in an if-else to print 'Condition met' or 'Condition not met'.

public class If_If_else_Q8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        boolean result = (a < b && b < 20); // true

        if(result){
            System.out.println("Condition met");
        }else{
            System.out.println("Condition not met");
        }

    }
}
