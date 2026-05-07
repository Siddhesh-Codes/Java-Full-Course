public class DefensiveImmutableClass {
    public static void main(String[] args) {
        College college = new College("Pillai College of Engineering", "New Panvel");

        Student s1 = new Student(21, "Siddhesh", college);

        System.out.println(s1.getCollege().name); // Pillai College of Engineering

        s1.getCollege().name = "IIT Bombay";

        System.out.println(s1.getCollege().name); // Pillai College of Engineering
    }
}

// Immutable
// defensive copy of college (non primitive)
final class Student {
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = new College(college.name, college.address);
    }

    // getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        return new College(this.college.name, this.college.address);
    }
}

// Mutable
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
