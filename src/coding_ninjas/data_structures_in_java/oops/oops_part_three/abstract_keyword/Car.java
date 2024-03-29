package coding_ninjas.data_structures_in_java.oops.oops_part_three.abstract_keyword;

public abstract class Car extends Vehicle {
    int numberOfDoors;

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

    @Override
    public boolean isMotorized() {
        return true;
    }
}

