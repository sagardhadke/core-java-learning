// Assignment with Expression

// Declare:
// int x = 8;
// int y = 12;
//
// Apply:
// x += y * 2;
//
// Print x.
// Explain in comments why multiplication happens before +=.

public class Assignment_Q7 {
    public static void main(String[] args) {
        int x = 8;
        int y = 12;

        x += y * 2;
        // x = 8 + (12 * 2)
        // x = 8 + 24
        // x = 32

        System.out.println(x); // 32
    }
}
