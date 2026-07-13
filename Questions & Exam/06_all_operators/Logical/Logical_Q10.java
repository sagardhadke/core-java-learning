// int a = 5, b = 10; boolean r = !(a > b) && !(a == b); Print r and explain in a comment using De
// Morgan's law hint: !(A&&B;) == !A||!B

public class Logical_Q10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean r = !(a > b) && !(a == b);

        // (a > b)  -> (5 > 10)  -> false
        // !(a > b) -> !false    -> true
        // (a == b) -> (5 == 10) -> false
        // !(a == b)-> !false    -> true
        // true && true -> true

        // De Morgan's Law:
        // !(A && B) == !A || !B
        // !(A || B) == !A && !B
        // Here, the expression uses negation (!) on each condition separately before applying &&.

        System.out.println(r);
    }
}
