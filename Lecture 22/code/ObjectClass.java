import java.util.Objects;

public class ObjectClass {
    /* 
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(); 
        s1.name = "Siddhesh";
        s1.age = 21;

        
        //System.out.println(s1);

        Student s2 = new Student();
        s2.name = "Siddhesh";
        s2.age = 21;

        // System.out.println(s1.equals(s2));

        // System.out.println(s1.hashCode() == s2.hashCode());

        // System.out.println(s1.getClass().getName());
        // System.out.println(s2.getClass().getName());

        // System.out.println(s1 instanceof Object);

        Student s3 = (Student) s1.clone();
        System.out.println(s3.name);
        System.out.println(s3.age);

    }
}

// instanceOf operator -> Check if an object is instance of a class or any of its subclass

class Student extends Object implements Cloneable {
    String name;
    int age;

    @Override
    public String toString() {
        return (name + " , " + age);
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;

        if(obj == null) {
            return false;
        }

        // Check if both classes are of type Student
        // If not checked --> ClassCastExceptions
        if(obj.getClass() != this.getClass()) {
            return false;
        }
        
        Student s = (Student) obj;

        return (this.name == s.name && this.age == s.age);
    }

    @Override
    public int hashCode() {
        // int result = 17;
        // result = result * 31 + age;
        // result = result * 31 + ((name == null) ? 0 : name.hashCode());

        // return result;

        return Objects.hash(name, age);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    */


    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Siddhesh";
        s1.age = 21;

        // System.out.println(s1.toString()); // Siddhesh 21
        
        // Will get same output because by default println method use toString() method.
        // System.out.println(s1); // Siddhesh 21

        Student s2 = new Student();

        s2.name = "Siddhesh";
        s2.age = 21;

        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode() == s2.hashCode());
    }
}

class Student extends Object {
    String name;
    int age;

    // By Overriding toString() method we can set our own usage of the 
    // toString() method
    @Override 
    public String toString() {
        return (name + " " + age);
    }

    @Override 
    public boolean equals(Object obj) {
        // we can typecast into class
        if(this == obj) return false;
        
        if (obj == null) {
            return false;
        }
        
        // Check if both classes are of type Student
        // If we did'nt check the we will get "ClassCastException"
        if(obj.getClass() != this.getClass()) return false;
        
        Student s = (Student) obj;

        return (this.name == s.name && this.age == s.age);
    }

    @Override 
    public int hashCode() {
        int res = 17;
        res = res * 31 + age;
        res = res * 31 + ((name == null) ? 0 : name.hashCode());

        return res;
    }
}