// Anonymous class

public class AnonymousClass {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.introduce();
        // Person p2 = new Guest();
        // p2.introduce();

        // Anonymous Class
        Person p2 = new Person() {
            String name = "Siddhesh";

            @Override
            void introduce() {
                // we can call Anonymous Class methods in other class method. but we can't call it independently. 
                greet();
                System.out.println("Hi, I am " + name);
            }
            void greet() {
                  System.out.println("Hello");
            }
        };
        // p2.greet(); // wrong.
        p2.introduce();
    }
}

class Person {
    Person() {

    }
    void introduce() {
        System.out.println("Hi, I am a person");
    }
}

// class Guest extends Person {
//     @Override
//     void introduce() {
//         System.out.println("Hi, I am a Guest");
//     }
// }

/*
Static Nested class
Inner Class
Anonymous class --> Lambdas
Local class
*/
