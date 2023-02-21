package coding_ninjas.data_structures_in_java.oops.oops_part_three.abstract_keyword;

public class BMW extends Car {

    public static final String NAME = "BMW";
    public BMW(String color, int maxSpeed, int numberOfDoors) {
        super(color, maxSpeed, numberOfDoors);
    }

    @Override
    public String getCompanyName() {
        return NAME;
    }
}
