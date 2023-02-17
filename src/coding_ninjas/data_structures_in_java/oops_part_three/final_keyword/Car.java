package coding_ninjas.data_structures_in_java.oops_part_three.final_keyword;

public class Car extends Vehicle {
    int numberOfDoors;

    /* In this constructor need a param color which is associated to super class or need to delete this constructor
    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car Object created with variable numberOfDoors: " + this.numberOfDoors);
    }
    */

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

