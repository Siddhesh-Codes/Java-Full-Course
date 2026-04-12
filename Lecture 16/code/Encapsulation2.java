// Encapsulation in Java
// Getter and Setter Methods
// 1. Getter and setter methods are used to access and modify the private variables of a class. 
// 2. A getter method is used to retrieve the value of a private variable, while a setter method is used to set or update the value of a private variable. 
// 3. By using getter and setter methods, we can control the access to the private variables and ensure that the data is valid before it is modified.

public class Encapsulation2 {
    public static void main(String[] args) {
        Student obj = new Student("Siddhesh", 1, 21, 82.40);

        // obj.setName("Siddhesh");
        // obj.setRollNo(01);
        // obj.setMarks(89.00);
        // obj.setAge(21);

        System.out.println(obj.getName() + " " + obj.getRollNo() + " " + obj.getMarks() + " " + obj.getAge());
    }   
}



class Student {
    private String name;
    private int rollNumber;
    private int age;
    private double marks; 

    Student(String name, int rollNumber, int age, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.marks = marks;
    }
    
    // public void setName(String name) {
    //     this.name = name;
    // }

    public String getName() {
        return name;
    }

    // public void setRollNo(int rollNumber) {
    //     this.rollNumber = rollNumber;
    // }

    public int getRollNo() {
        return rollNumber;
    }

    // public void setAge(int age){
    //     this.age = age;
    // }

    public int getAge(){
        return age;
    }

    // public void setMarks(double marks) {
    //     this.marks = marks;
    // }
    
    public double getMarks () {
        return marks;
    }
}