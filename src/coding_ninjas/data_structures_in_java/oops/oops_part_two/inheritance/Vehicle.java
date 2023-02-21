package coding_ninjas.data_structures_in_java.oops.oops_part_two.inheritance;

public class Vehicle {
    private String color;
    int maxSpeed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String[] temp = this.getClass().getName().split("\\.");
        return temp[temp.length - 1] + " {" +
                "color = '" + this.getColor() + '\'' +
                ", maxSpeed = " + maxSpeed +
                '}';
    }
}
