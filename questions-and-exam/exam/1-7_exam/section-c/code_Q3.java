//* Declare int a = 25, b = 10, c = 15. Using if-else (not a ladder), check if num is
// divisible by BOTH 3 and 5 using num = 15. Print 'FizzBuzz' or 'Not FizzBuzz'. Then find
// the largest among a, b, c using nested if-else and print it.

public class code_Q3 {
    public static void main(String[] args) {
        int a = 25;
        int b = 10;
        int c = 15;

        int num = 15;

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        }else {
            System.out.println("Not FizzBuzz");
        }

        //* Largest

        if(a > b){
            if(a > c){
                System.out.println("A " + a + " is Greater");
            }else{
                System.out.println("C " + c + " is Greater");
            }
        }else{
            if(b > a){
                System.out.println("B " + b + " is Greater");
            }else{
                System.out.println("A " + a + " is Greater");
            }
        }
    }
}
