// Q7. Declare int num = 15. Check if num is divisible by BOTH 3 and 5 at the same time. Print 'FizzBuzz'
// or 'No'.

public class If_If_else_Q7 {
    public static void main(String[] args) {
        int num = 15;

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        }else{
            System.out.println("No");
        }
    }
}
