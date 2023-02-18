package coding_ninjas.data_structures_in_java.oops_part_three.abstract_keyword;
public class Bicycle extends Vehicle {
    String companyName;

    public Bicycle(String companyName, String color) {
        super(color);
        this.companyName = companyName;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "name = '" + companyName + '\'' +
                ", Color = '" + super.getColor() + '\'' +
                '}';
    }

    @Override
    public boolean isMotorized() {
        return false;
    }

    @Override
    public String getCompanyName() {
        return this.companyName;
    }


}
