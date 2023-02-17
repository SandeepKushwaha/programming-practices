package coding_ninjas.data_structures_in_java.oops_part_three.final_keyword;

// If class is final that means can not be extends any other class i.e. can't be has child class.
public /*final*/ class Vehicle {
    final private String color;
    private int maxSpeed;

    // default constructor
    /* color is final which required to assign on the time of object creation.
    public Vehicle() {
        System.out.println("Vehicle Object created with no values.");
    }
    */

    // parameterized constructor
    public Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Object created with values=> color: " + this.color + ", and speed: " + this.maxSpeed);
    }

    public String getColor() {
        return color;
    }

    /* final member can not be updatable
    public void setColor(String color) {
        this.color = color;
    }*/

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
}
