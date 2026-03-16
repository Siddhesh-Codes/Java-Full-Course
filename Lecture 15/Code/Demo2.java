// Final Keyword
// One line Definition: The final keyword in Java is used to declare constants, prevent method overriding, and prevent inheritance of classes. When a variable is declared as final, its value cannot be changed once it has been assigned. When a method is declared as final, it cannot be overridden by subclasses. When a class is declared as final, it cannot be subclassed.

// Rules of final members:
// 1. A final variable can only be initialized once, either at the time of declaration or within a constructor.
// 2. A final method cannot be overridden by subclasses.
// 3. A final class cannot be subclassed.

public class Demo2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x;
        x = 4;
        System.out.println(x);
    }
}

//why main is static in java ??
// Demo4 d1 = new Demo4();
// d1.main()
// Demo2.main()

class Random {
    static final double PI;

    static {
        PI = 3.14;
    }
}
