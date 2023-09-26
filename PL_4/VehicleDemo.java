class Vehicle<T> {
    private int wheels;
    private T speed;

    public Vehicle(int wheels, T speed) {
        this.wheels = wheels;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Wheels: " + wheels);
        System.out.println("Speed: " + speed);
    }

    public T getSpeed() {
        return speed;
    }
}

class Car<T> extends Vehicle<T> {
    private int passengers;

    public Car(int wheels, T speed, int passengers) {
        super(wheels, speed);
        this.passengers = passengers;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Passengers: " + passengers);
    }
}

class Truck<T> extends Vehicle<T> {
    private double loadLimit;

    public Truck(int wheels, T speed, double loadLimit) {
        super(wheels, speed);
        this.loadLimit = loadLimit;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Limit: " + loadLimit);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car<Integer> car = new Car<>(4, 120, 5);
        Truck<Double> truck = new Truck<>(6, 80.5, 5000);

        car.displayInfo();
        truck.displayInfo();

        if (car.getSpeed() > truck.getSpeed()) {
            System.out.println("Car is faster than Truck.");
        } else if (car.getSpeed() < truck.getSpeed()) {
            System.out.println("Truck is faster than Car.");
        } else {
            System.out.println("Car and Truck have the same speed.");
        }
    }
}
