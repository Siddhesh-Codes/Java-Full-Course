// Encapsulation
// 1. Encapsulation is the process of wrapping data (variables) and code acting on the data (methods) together as a single unit. 
// 2. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

// Rules of Encapsulation:
// 1. Make all the data members of the class private.
// 2. Provide public getter and setter methods to modify and view the variables values.

// Advantages of Encapsulation:
// 1. It provides control over the data by allowing us to set conditions on the values that can be assigned to the variables.
// 2. It helps in achieving data hiding, which protects the data from unauthorized access and modification.
// 3. It improves maintainability and flexibility of the code by allowing us to change the implementation of the class without affecting the code that uses the class.

public class Encapsulation1 {
    public static void main(String[] args) {
        bankAccount obj = new bankAccount();

        obj.deposit(1000);
        obj.withdraw(500);
        obj.deposit(5000);
        obj.withdraw(500000);


        System.out.println("Current Balance: " + obj.getBalance());
    }   
}
// we can'nt assign private access modifier to class. It can only be applied to members of the class.
// private class bankAccount
class bankAccount {
    private double balance;

    public void deposit(int amount) {
        if(amount <= 0) System.out.println("Please enter valid Amount!!");
        else {
            balance += amount;
            System.out.println(amount + " Deposited Successfully");
        } 
    }

    public void withdraw (int amount) {
        if(amount > balance) System.out.println("Insufficient Balance!!");
        else {
            balance -= amount;
            System.out.println(amount + " Withdrew Successfully");
        } 
    }

    
    // getter/setter
    public double getBalance() {
        return balance;
    }
} 