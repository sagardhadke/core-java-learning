package if_else_switch_7;

//* Question 5: Temperature Category

public class TemperatureCategory {
    public static void main(String[] args) {
        int temp = 30;

        // Method 1 using if-else
        if (temp < 10) {
            System.out.println("Very Cold");
        } else if (temp >= 10 && temp < 25) {
            System.out.println("Moderate");
        } else if (temp >= 25) {
            System.out.println("Hot");
        } else {
            System.out.println("Invalid");
        }

    }
}
