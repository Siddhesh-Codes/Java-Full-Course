public class ImmutableClass {
    public static void main(String[] args) {
        College clg = new College("Pillai College of Engineering", "New Panvel");
        Student ob = new Student(21, "Siddhesh", clg);
        // ob.getAge();
        // ob.getName();
        // ob.getCollege();
        clg.getCollege();
        clg.getAddress();

        clg.name = "ABC University";
        clg.address = "Panvel";

        clg.getCollege();
        clg.getAddress();

        // clg.name = "ABC University";

        // System.out.println(clg.name);

        /*
         * College college = new College("IIT G", "Assam");
         * 
         * Student s1 = new Student(28, "Aditya", college);
         * 
         * System.out.println(s1.getCollege().name); // IIT G
         * 
         * s1.getCollege().name = "IIT B";
         * 
         * System.out.println(s1.getCollege().name); // IIT B
         */
    }
}

// Immutable Class - (Not purely Immutable)
final class Student {
    private final String name;
    private final int age;
    private final College college;

    Student(int age, String name, College college) {
        this.college = college;
        this.name = name;
        this.age = age;
    }

    // Getters
    void getName() {
        System.out.println(name);
    }

    void getAge() {
        System.out.println(age);
    }

    void getCollege() {
        System.out.println(college);
    }
}

// Mutable Class
class College {
    String name, address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void getCollege() {
        System.out.println(name);
    }

    void getAddress() {
        System.out.println(address);
    }
}
/*
 * // (NOt purely immutable)
 * final class Student {
 * private final int age;
 * private final String name;
 * private final College college;
 * 
 * Student(int age, String name, College college) {
 * this.age = age;
 * this.name = name;
 * this.college = college;
 * }
 * 
 * // getters
 * public int getAge() {
 * return this.age;
 * }
 * 
 * public String getName() {
 * return this.name;
 * }
 * 
 * public College getCollege() {
 * return this.college;
 * }
 * }
 * 
 * // Mutable
 * class College {
 * String name;
 * String address;
 * 
 * College(String name, String address) {
 * this.name = name;
 * this.address = address;
 * }
 * }
 * 
 */