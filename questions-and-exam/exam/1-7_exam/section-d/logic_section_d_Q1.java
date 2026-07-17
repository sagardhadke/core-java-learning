//* Write a complete Java program for the following: (a) Declare int a = 5, b = 10.
// Compute and print all five arithmetic results (sum, difference, product, quotient,
// remainder) with labels. (b) Using if-else, print which of a or b is larger. (c) Using nested
// if-else, classify b as: positive-even, positive-odd, negative-even, or negative-odd. (d)
// Add a comment at the top of the file naming all three topics this question covers

public class logic_section_d_Q1 {
    public static void main(String[] args) {

        //* D

        /*
        * Variables, DataTypes
        * if-else, nested if-else
        */

        int a = 5;
        int b = 10;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

        //* B

        if(a > b){
            System.out.println("A" + a + " is Greater");
        }else {
            System.out.println("B" + b + " is Greater");
        }

        //* C

        if(a > b){
            if(a > 0){

                if(a % 2 == 0){
                    System.out.println("positive-even");
                }else {
                    System.out.println("positive-odd");
                }

            }else{
                if(a % 2 == 0){
                    System.out.println("negative-even");
                }else {
                    System.out.println("negative-odd");
                }
            }
        }else {
            if(b > 0){
                if(b % 2 == 0){
                    System.out.println("positive-even");
                }else {
                    System.out.println("positive-odd");
                }

            }else{
                if(b % 2 == 0){
                    System.out.println("negative-even");
                }else {
                    System.out.println("negative-odd");
                }
            }
        }



    }
}
