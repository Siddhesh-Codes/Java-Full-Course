public class Static_Method {
    public static void main(String[] args) {
        A a = new B();
        // a.fun();
        //System.out.println(a.x);
        // System.out.println(a.getX());
    }
}

// Static --> they belong to class and not to objects
// private methods cant be overridden 
// final methods cannot be overridden

// Final --> class ??? --> you cannot create child of that class

// Fields / Variables they cannot be polymorphic

class A {
    static void fun() {
        System.out.println("Hello from Parent Class!!");
    }

    private void fun2() {
        System.out.println("Hello from Parent Class!!");
    }

    final void fun3() {
        System.out.println("Hello from Parent Class!!");
    }
}

class B extends A {
    static void fun() {
        System.out.println("Hello from Child Class!!");
    }

    private void fun2() {
        System.out.println("Hello from Child Class!!");
    }

    // final void fun3() {
    //     System.out.println("Hello from Child Class!!");
    // }
}


// class A {
//     //int x = 10;

//     int getX() {
//         return 10;
//     }
// }

// class B extends A {
//     int getX() {
//         return 20;
//     }
// }


