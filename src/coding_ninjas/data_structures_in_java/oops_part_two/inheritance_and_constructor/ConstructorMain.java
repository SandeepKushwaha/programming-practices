package coding_ninjas.data_structures_in_java.oops_part_two.inheritance_and_constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        Car car = new Car(); // creating object with default constructor
        System.out.println(car);
        System.out.println();

        Car newCar = new Car(4);
        System.out.println(newCar);
        System.out.println();

        Car carWithAllValues = new Car("Blue", 120, 4);
        System.out.println(carWithAllValues);
    }
}
