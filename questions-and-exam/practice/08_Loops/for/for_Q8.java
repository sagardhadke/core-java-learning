//* Q8. Use a for loop to check if a number is prime. Use num = 29. Print 'Prime' or 'Not Prime'.

public class for_Q8 {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}


/*
* Tree Explanation

*  Start
│
├── num = 17
├── isPrime = true
│
├── Is num <= 1?
│   │
│   ├── Yes
│   │     └── isPrime = false
│   │
│   └── No
│         │
│         └── for (i = 2; i < num; i++)
│               │
│               ├── i = 2
│               │     │
│               │     └── 17 % 2 == 0 ?
│               │            ├── Yes → isPrime = false → break
│               │            └── No → Continue
│               │
│               ├── i = 3
│               │     │
│               │     └── 17 % 3 == 0 ?
│               │            ├── Yes → isPrime = false → break
│               │            └── No → Continue
│               │
│               ├── i = 4
│               │     │
│               │     └── 17 % 4 == 0 ?
│               │            └── No
│               │
│               ├── ...
│               │
│               └── i = 16
│                     │
│                     └── 17 % 16 == 0 ?
│                            └── No
│
├── Is isPrime == true?
│   │
│   ├── Yes
│   │     └── Print: "17 is a Prime Number"
│   │
│   └── No
│         └── Print: "17 is not a Prime Number"
│
└── End

* */