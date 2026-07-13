public class AllDataTypes {
    public static void main(String[] args) {

        // =========================
        // Primitive Data Types
        // =========================
        byte b = 100;
        short s = 20000;
        int i = 500000;
        long l = 10000000000L;
        float f = 3.14f;
        double d = 99.999;
        char ch = 'A';
        boolean flag = true;

        System.out.println("----- Primitive Data Types -----");
        System.out.println("byte     : " + b);
        System.out.println("short    : " + s);
        System.out.println("int      : " + i);
        System.out.println("long     : " + l);
        System.out.println("float    : " + f);
        System.out.println("double   : " + d);
        System.out.println("char     : " + ch);
        System.out.println("boolean  : " + flag);

        // =========================
        // Non-Primitive Data Types
        // =========================

        // String
        String name = "John";

        // Array
        int[] numbers = {10, 20, 30};

        // Class Object
        Student student = new Student();

        // Interface Reference
        Animal animal = new Dog();

        // Enum
        Day today = Day.MONDAY;

        System.out.println("\n----- Non-Primitive Data Types -----");
        System.out.println("String   : " + name);

        System.out.print("Array    : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Class Object : " + student);
        animal.sound();
        System.out.println("Enum     : " + today);
    }
}

// Class
class Student {
    public String toString() {
        return "Student Object";
    }
}

// Interface
interface Animal {
    void sound();
}

// Class implementing Interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Interface: Dog barks");
    }
}

// Enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}