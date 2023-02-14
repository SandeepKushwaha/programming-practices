package coding_ninjas.data_structures_in_java.oops_part_two.polymorphism;

public class Car extends Vehicle {
    int numberOfDoors;

    // Overriding the method which is originally defined inside the Parent class 'Vehicle'.

    public Car() {
        System.out.println("Car Object created without any value.");
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car Object created with variable numberOfDoors: " + this.numberOfDoors);
    }

    public Car(String color, int maxSpeed, int numberOfDoors) {
        super(color, maxSpeed); // Vehicle's Constructor called first then current class object created.
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car Object created with variables=> color: " + this.getColor()
                + ", maxSpeed: " + this.getColor()
                + ", numberOfDoors: " + this.numberOfDoors);
    }

    @Override
    public void print() {
        String temp = super.toString() + "\b, numberOfDoors = " + numberOfDoors + '}';
        System.out.println(temp);
    }
}

