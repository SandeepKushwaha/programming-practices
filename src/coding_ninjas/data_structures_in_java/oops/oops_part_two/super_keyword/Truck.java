package coding_ninjas.data_structures_in_java.oops.oops_part_two.super_keyword;

import coding_ninjas.data_structures_in_java.oops.oops_part_two.super_keyword.different_package.Vehicle;

public class Truck extends Vehicle {
    private int maxLoadCapacity;
    private int maxSpeed; //

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed; // current class member (duplicate) try to avoid this kind of mistakes
        super.maxSpeed = 100; // super class member
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public void print() {
        String[] currentFullClassName = this.getClass().getName().split("\\.");
        String currentClassContent = currentFullClassName[currentFullClassName.length - 1]
                + " {color = " + this.getColor()
                + ", maxSpeed = " + this.getMaxSpeed()
                + ", maxLoadCapacity = " + this.getMaxLoadCapacity() + '}';

        String[] parentFullClassName = this.getClass().getSuperclass().getName().split("\\.");
        String parentClassContent = '\t' + " :: parent class content : "
                + parentFullClassName[parentFullClassName.length - 1] + " { color = '"
                + super.getColor() + "', maxSpeed = " // calling super class member
                + super.maxSpeed + "}"; // calling super class member

        System.out.println(currentClassContent + parentClassContent);
    }
}
