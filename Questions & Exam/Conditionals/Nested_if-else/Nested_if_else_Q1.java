// Q1. Declare int age = 20, boolean hasID = true. Using nested if, print 'Entry Allowed' only if age >= 18
// AND hasID is true. Otherwise print 'Denied'

public class Nested_if_else_Q1 {
    public static void main(String[] args) {
        int age = 20;
        boolean hadID = true;

        if(age >= 18){
            if(hadID == true){
            System.out.println("Entry Allowed");
            }else{
                System.out.println("Denied");
            }
        }  else{
            System.out.println("Denied");
        }

    }
}
