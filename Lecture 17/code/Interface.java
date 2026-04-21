public class Interface {
    public static void main(String[] args) {
        Car c1 = new FuelCar();
        Car c2 = new ElectricCar();

        c1.start();
        c2.start();

        c2.accelerate();
        c1.accelerate();


        c1.brake();
        c2.brake();
    }
}

interface Car {
    void start();
    void accelerate();
    void brake();
}

class ElectricCar implements Car {
    @Override
    public void start() {
        System.out.println("Electric Car started!!!");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Car Accelerated!!");
    }

    @Override
    public void brake() {
        System.out.println("Brake Applied on the Electric Car!!!");
    }
}

class FuelCar implements Car {
    @Override
    public void start() {
        System.out.println("Fuel Car Started!!");
    }

    @Override
    public void accelerate() {
        System.out.println("Fuel car Accelerated!!");
    }

    @Override
    public void brake() {
        System.out.println("Brake Applied on the Fuel Car!!");
    }
}
