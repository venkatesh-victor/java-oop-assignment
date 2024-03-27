package polymorphism;

class Vehicle {
    protected int vehicleNumber;
    protected int numberOfWheels;
    protected int averageSpeed;
    protected String type;

    public void move() {
        System.out.println("Vehicle is moving");
    }

    public void stop() {
        System.out.println("Vehicle has been stopped");
    }

    public void display() {
        System.out.println(this.vehicleNumber + "\t" + this.numberOfWheels +
                "\t" + this.averageSpeed + "\t" + this.type);
    }
}

class Bus extends Vehicle {
    public Bus(int numberOfWheels, int averageSpeed, String type,
               int vehicleNumber)
    {
        this.numberOfWheels = numberOfWheels;
        this.averageSpeed = averageSpeed;
        this.type = type;
        this.vehicleNumber = vehicleNumber;

    }
    public void move() {
        System.out.println("Bus is moving.");
    }

    public void stop() {
        System.out.println("Bus has been stopeed.");
    }
}

class Bike extends Vehicle {

    public Bike(int numberOfWheels, int averageSpeed,
                String type, int vehicleNumber)
    {
        this.numberOfWheels = numberOfWheels;
        this.averageSpeed = averageSpeed;
        this.type = type;
        this.vehicleNumber = vehicleNumber;
    }
    public void move() {
        System.out.println("Bike is moving.");
    }

    public void stop() {
        System.out.println("Bike has been stopped");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Bus bus = new Bus(4, 60, "diesel", 76665);
        bus.move();
        bus.display();
        bus.stop();

        System.out.println();

        Bike bike = new Bike(2, 65, "petrol", 4567);
        bike.move();
        bike.display();
        bike.stop();
    }
}
