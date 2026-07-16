//* Question 7: Largest of Three Numbers

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " Is Greater");
        } else if (num2 > num3) {
            System.out.println(num2 + " Is Greater");
        } else {
            System.out.println(num3 + " Is Greater");

        }
    }
}
