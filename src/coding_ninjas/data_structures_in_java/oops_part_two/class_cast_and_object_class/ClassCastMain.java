package coding_ninjas.data_structures_in_java.oops_part_two.class_cast_and_object_class;

public class ClassCastMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Car("Yellow", 120, 4);
        Car car = (Car) vehicle;
        car.print();
        vehicle.print();
        System.out.println();
        
        Object object = new Vehicle();

        System.out.println(object);

        // bad practices
        // following errors appear on runtime but compilation successful
        // Vehicle v = (Vehicle) new Object(); // Parent class can't be cast to child class
        // Car c = (Car) new Vehicle();

        // NOTE:
        // In object-oriented programming
        // Child class can behave as parent but
        // Parent class can't behave as child.
    }
}
