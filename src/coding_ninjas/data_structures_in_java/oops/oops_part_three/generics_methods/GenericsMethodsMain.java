package coding_ninjas.data_structures_in_java.oops.oops_part_three.generics_methods;

public class GenericsMethodsMain {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Print.printArray(arr);

        String[] strings = {"I", "Love", "Programming", "in", "Java"};
        Print.printArray(strings);

        Vehicle[] vs = {new Vehicle("EV"), new Vehicle("Petrol"), new Vehicle("Gas"), new Vehicle("Diesel")};
        Print.printArray(vs);
    }
}
