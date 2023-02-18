package coding_ninjas.data_structures_in_java.oops_part_three.abstract_keyword;

// If class having any member that is abstract then the class is abstract class
public abstract class Vehicle {
    final private String color;
    private int maxSpeed;

    public Vehicle(String color) {
        this.color = color;
    }

    public Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Object created with values=> color: " + this.color + ", and speed: " + this.maxSpeed);
    }

    public String getColor() {
        return color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
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

    public abstract boolean isMotorized();

    public abstract String getCompanyName();
}
