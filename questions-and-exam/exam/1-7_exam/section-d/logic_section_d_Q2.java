//* Write a complete Java program for the following: (a) Declare int year = 2100.
// Check the FULL leap year rule: Divisible by 4 AND (NOT divisible by 100 OR divisible
// by 400). Print 'Leap Year' or 'Not a Leap Year'. (b) Declare int day = 3. Using
// switch-case print the day name and whether it is a Weekday or Weekend. (c) In
// comments, explain step by step why 2100 fails the full leap year rule.

public class logic_section_d_Q2 {
    public static void main(String[] args) {
        //* A

        int year = 2100;

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");
        }

        //* B
        int day = 3;

        switch (day){
            case 1:
        }
    }
}
