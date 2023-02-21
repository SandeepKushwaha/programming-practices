package coding_ninjas.data_structures_in_java.oops.oops_part_two.polymorphism;

public class Vehicle {
    private String color;
    private int maxSpeed;

    // default constructor
    public Vehicle() {
        System.out.println("Vehicle Object created with no values.");
    }

    // parameterized constructor
    public Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Object created with values=> color: " + this.color + ", and speed: " + this.maxSpeed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println(this);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        String[] temp = this.getClass().getName().split("\\.");
        return temp[temp.length - 1] + " {" +
                "color = '" + this.getColor() + '\'' +
                ", maxSpeed = " + this.getMaxSpeed() +
                '}';
    }
}
