/*
Q5. Declare int seconds = 3725. Without using division on seconds directly,
compute and print the number of complete hours and complete minutes past the last full hour,
and the remaining seconds.
*/

public class ArithM_Q5 {
    public static void main(String[] args) {

        int seconds = 3725;
        int oneHour = 3600;
        int oneMinute = 60;

        // 3725 contains one full hour
        int hours = seconds / oneHour;

        int remaining = seconds % oneHour;

        // 125 seconds contains two complete minutes (120 seconds)
        int minutes = remaining / oneMinute;

        // final remaining seconds
        int finalSeconds = remaining % oneMinute; // 5

        // Print the result
        System.out.println(hours + " hour"); // 1 hour
        System.out.println(minutes + " minutes"); // 2 minutes
        System.out.println(finalSeconds + " seconds"); // 5 seconds
    }
}