public class SuperKeyword {
    public static void main(String[] args) {
        // EngineeringStudent es1 = new EngineeringStudent();
        // es1.name = "Siddhesh";
        // es1.age = 28;
        // es1.rollNo = 101;
        // es1.college = "Pillai";

        // es1.print();

    EngineeringStudent es2 = new EngineeringStudent("Siddhesh", 28, 101, "Pillai");
        es2.print();
    }
}

class Student {
    String name;
    int age;
    int rollNo;

    Student() {}

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    void print() {
        System.out.println(name + " , " + age + " , " + rollNo);
    }
}

class EngineeringStudent extends Student {
    String college;

    EngineeringStudent(String name, int age, int rollNo, String college) {
        super(name, age, rollNo);
        this.college = college;
    }

    void print() { 
       super.print();
       System.out.println(college);
    }
 
    
}
