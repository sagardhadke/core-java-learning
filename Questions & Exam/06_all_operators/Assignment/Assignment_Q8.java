// Chained Assignment

// Declare:
// int a, b, c, d;
//
// Assign all four variables the value 50 using a single statement.
// Then update:
// b += 10;
// c -= 20;
// d *= 2;
//
// Print all four variables.

public class Assignment_Q8 {
    public static void main(String[] args) {
        int a, b, c, d;

        a = b = c = d = 50;

         b += 10;
         c -= 20;
         d *= 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
