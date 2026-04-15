//Types of inheritance
// Simple inheritance
// multi-level inheritance 
// hierarchical inheritance
// multiple inheritance (not supported in java)

public class TypesOfInheritance {
    public static void main(String[] args) {
        // CSEEngineeringStudent cs1 = new CSEEngineeringStudent(); 

        // cs1.markAttendance();
        // cs1.attendLab();
        // cs1.attendCSELab();

        EngineeringStudent e = new EngineeringStudent();

        e.markAttendance();
        e.attendLab();

        MedicalStudent m = new MedicalStudent();
        m.markAttendance();
        m.attendLab();
    }
}

class Student { // Parent -> A
    String name;
    int age;

    public void markAttendance() {
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student { // Child. --> B
    void attendLab() {
        System.out.println("lab attended for engineering student");
    }
}

class MedicalStudent extends Student { // Child. --> C
    void attendLab() {
        System.out.println("lab attended for medical student");
    }
}


// class CSEEngineeringStudent extends EngineeringStudent {
//     void attendCSELab() {

//     }
// }

/*
Multi-level

Student 
|
EngineeringStudent
|
CSEEngineeringStudent
*/

/*
Hierarchy 
        A
      /   \
     B     C 

*/

/*
Multiple 
        A   B
         \  /
          C
*/     

