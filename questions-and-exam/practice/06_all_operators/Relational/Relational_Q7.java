// Declare char c = 'A'. Print the result of (c == 65). Explain the output in a comment

public class Relational_Q7 {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c == 65); // true
        // 'A' has the Unicode value 65, so c is automatically
        // compared with the integer 65, making the result true.
    }
}
