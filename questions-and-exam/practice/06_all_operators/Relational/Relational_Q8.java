// Declare int a = 15, b = 15. Print (a == b) and (a = b) in separate println statements. Note: one is
// relational, the other is assignment — which one won't compile inside println? Explain in a comment

public class Relational_Q8 {
    public static void main(String[] args) {
        int a = 15;
        int b = 15;

        System.out.println(a == b); // true
        System.out.println(a = b); // assign b value to a = 15
    }
}
