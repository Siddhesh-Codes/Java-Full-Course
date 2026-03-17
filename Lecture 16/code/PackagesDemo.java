//import packageName.className
// import college.Student;
// import school.Student;
import college.*;
import school.*;


public class PackagesDemo {
    public static void main(String[] args) {

        college.Student s1 = new college.Student();
        s1.print();
        school.Student s2 = new school.Student();
        s2.print();
    }
}
