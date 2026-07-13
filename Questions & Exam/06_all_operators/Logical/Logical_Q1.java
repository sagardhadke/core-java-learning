// int a = 25, b = 10, c = 15; boolean d = (a < b) && (b < c); Print d. explain why d is false in a comment.

public class Logical_Q1 {

    public static void main(String[] args) {
        int a = 25;
        int b = 10;
        int c = 15;
        boolean d =( (a < b) && (b < c) );

        System.out.println(d);// false Because a is not less then b AND b is not less then c
    }

}
