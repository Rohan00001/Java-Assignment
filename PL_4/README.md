# JAVA Programming PL-4

## Task 1: Vehicle Hierarchy

**Question:**
Create a generic base class called `Vehicle` that stores the number of wheels and speed. Create the following derived classes:
- `Car` that inherits `Vehicle` and also stores the number of passengers.
- `Truck` that inherits `Vehicle` and also stores the load limit.

Write a `main()` method to create objects of these classes and display all the information about `Car` and `Truck`. Also, compare the speed of the two vehicles, `Car` and `Truck`, and display "faster" or "slower" if `Car` is faster or slower than `Truck`.

```java
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

```

## Task 2: Building Hierarchy

**Question:**
Create a base class called `Building` that stores the number of floors, the number of rooms, and the total area in square feet. Create a derived class called `House` that inherits `Building` and also stores the number of bedrooms and bathrooms. Create another derived class called `Office` that inherits `Building` and also stores the number of chairs, tables, and telephones.

Write a `main()` method to declare one object of each of the classes mentioned and find:
(i) the area of the building,
(ii) which object has the smallest area.

```java
class Building {
    private int floors;
    private int rooms;
    private double totalArea;

    public Building(int floors, int rooms, double totalArea) {
        this.floors = floors;
        this.rooms = rooms;
        this.totalArea = totalArea;
    }

    public double calculateArea() {
        return totalArea;
    }

    public static Building findSmallestArea(Building[] buildings) {
        Building smallest = buildings[0];
        for (Building building : buildings) {
            if (building.calculateArea() < smallest.calculateArea()) {
                smallest = building;
            }
        }
        return smallest;
    }
}

class House extends Building {
    private int bedrooms;
    private int bathrooms;

    public House(int floors, int rooms, double totalArea, int bedrooms, int bathrooms) {
        super(floors, rooms, totalArea);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }
}

class Office extends Building {
    private int chairs;
    private int tables;
    private int telephones;

    public Office(int floors, int rooms, double totalArea, int chairs, int tables, int telephones) {
        super(floors, rooms, totalArea);
        this.chairs = chairs;
        this.tables = tables;
        this.telephones = telephones;
    }
}

public class BuildingDemo {
    public static void main(String[] args) {
        Building house = new House(2, 5, 2000.0, 3, 2);
        Building office = new Office(1, 10, 1500.0, 20, 15, 5);

        Building[] buildings = {house, office};

        for (Building building : buildings) {
            System.out.println("Area of the building: " + building.calculateArea() + " sq. ft.");
        }

        Building smallestAreaBuilding = Building.findSmallestArea(buildings);
        System.out.println("Smallest area building: " + smallestAreaBuilding.getClass().getSimpleName());
    }
}

```

## Task 3: 2D Figure Hierarchy

**Question:**
Create a base class called `TwoDFigure` that holds two dimensions of a figure. It also declares a method called `calculateArea()` that, when overridden by derived classes, returns the area of the type of 2D figure defined by the derived class. Create two derived classes, `Rectangle` and `Triangle`, that inherit `TwoDFigure`.

Write a `main()` method to create objects of these classes and display the area of `Rectangle` and `Triangle`. Note: Use a base pointer to call a method.

```java
class TwoDFigure {
    double dimension1;
    double dimension2;

    public TwoDFigure(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double calculateArea() {
        return 0.0; // Default implementation, to be overridden by derived classes
    }
}

class Rectangle extends TwoDFigure {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double calculateArea() {
        return dimension1 * dimension2;
    }
}

class Triangle extends TwoDFigure {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double calculateArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

public class TwoDFigureDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 8.0);
        Triangle triangle = new Triangle(4.0, 6.0);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}

```
