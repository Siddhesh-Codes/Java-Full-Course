public class Demo2 {
    public static void main(String[] args) {
        // Autoboxing
        // int x = 10;
        // Integer y = x;  // Autoboxing

        // System.out.println(x);
        // System.out.println(y);  // unboxing

        // //Unboxing
        // Integer a = 20; // Autoboxing
        // int b = a; // unboxing

        // System.out.println(a); // unboxing
        // System.out.println(b);  

        // int x = 50;
        // printInteger(x);

        // Integer a = 10;
        // Integer b = 20;

        // int sum = a.intValue() + b.intValue();
        // System.out.println(sum);

        // IMP: it will give error (Null pointer error)
        Integer x = null;
        int y = x;

        System.out.println(y);   
    }

    static void printInteger(Integer x) {
        System.out.println(x);
    }
}

// Works with
// 1. Assignments
// 2. Method calls
// 3. Arithmetic operations


