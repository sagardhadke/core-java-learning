// Assignment Evaluation

// Declare:
// int a = 5;
// int b = 10;
//
// Apply:
//
// a += b;
// b -= a;
// a *= b;
//
// Print a and b.
//
// Write step-by-step comments showing how each assignment changes the values.

public class Assignment_Q10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a += b;
        System.out.println(a);
        b -= a;
        a *= b;

        System.out.println(a);
        System.out.println(b);
    }
}
