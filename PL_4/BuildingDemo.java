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
