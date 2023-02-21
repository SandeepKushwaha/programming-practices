package coding_ninjas.data_structures_in_java.oops.oops_part_two.protected_keyword;

import coding_ninjas.data_structures_in_java.oops.oops_part_two.protected_keyword.different_package.Vehicle;

public class Truck extends Vehicle {
    int maxLoadCapacity;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void print() {
        String[] fullClassName = this.getClass().getName().split("\\.");
        String parentClassContent = fullClassName[fullClassName.length - 1]
                + " {color = " + getColor() + ", maxSpeed = " + getMaxSpeed();
        String currentClassContent = ", maxLoadCapacity = " + maxLoadCapacity + '}';
        System.out.println(parentClassContent + currentClassContent);
    }
}
