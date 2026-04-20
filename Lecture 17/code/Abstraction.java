public class Abstraction {
    public static void main(String[] args) {
        // Car car = new FuelCar();
        // car.start();
        // car.accelerate();
        // car.brake();

        // We Cannot create objects of abstract class
        // Car c = new Car(); 

        Car c = new ElectricCar(); 
        
        c.start();
        c.accelerate();
        c.brake();
        c.accelerate();
        c.accelerate();
    }
}


abstract class Car {
    void start() {
        System.out.println("Car Started!!");
    }  

    abstract void accelerate();

    abstract void brake();
}

class ElectricCar extends Car {

    @Override
    void accelerate() {
        // TODO Auto-generated method stub
        System.out.println("Accelerate Speed!!!");
    }

    @Override
    void brake() {
        // TODO Auto-generated method stub
        System.out.println("Break Applied!!!");
    }
}


// abstract class Car {
//     void start() {
//         System.out.println("Car started");
//     }

//     abstract void accelerate();

//     abstract void brake();
// }

// class FuelCar extends Car {

//     @Override
//     void accelerate() {
//         System.out.println("Fuel car is accelerating");
//     }

//     @Override
//     void brake() {
//         System.out.println("Fuel car is stopping");
//     }

// }

// class ElectricCar extends Car {
//     @Override
//     void accelerate() {
//         System.out.println("Electric car is accelerating");
//     }

//     @Override
//     void brake() {
//         System.out.println("Electric car is stopping");
//     }

// }