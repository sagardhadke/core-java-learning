//* Declare int a = 300 and cast it to byte. Declare double d = 9.75 and cast it to int.
// Declare int x = 65 and cast it to char. Print all original and casted values with labels.
// Add a comment for each cast explaining what happened.

public class code_Q1 {
    public static void main(String[] args) {
        int a = 300;

        byte b = (byte) a; // convert int 300 to byte so it's become 44

        double d = 9.75;

        int i = (int) d; // convert double value 9.75 to int so it's become 9 remove that .75

        int x = 65;

        char c = (char) x; // convert int value 65 to char , the ascii value of 65 is Capital A

        System.out.println("Int: " + a + " , " + "Cast to Byte " + b); // Int: 300 , Cast to Byte 44
        System.out.println("Double: " + d + " , " + "Cast to Int " + i); // Double: 9.75 , Cast to Int 9
        System.out.println("Char: " + x + " , " + "Cast to Char " + c); // Char: 65 , Cast to Char A
    }
}
