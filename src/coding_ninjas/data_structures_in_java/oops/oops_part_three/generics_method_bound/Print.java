package coding_ninjas.data_structures_in_java.oops.oops_part_three.generics_method_bound;

public class Print {
    // This method can be accessible to every Type of PrintInterface.
    // T bound as following:
    // 1. No bound.
    // 2. extends to Vehicle or subclass(restrictive)
    //  Vehicle -> Car -> BMW
    // 3. Interface.
    //
    // that is T extends to that type of class or subclass or interface (or record).
    public static<T extends PrintInterface> void printArray(T[] arr) {
        for (T t : arr) {
            t.print();
        }
        /* Traditional for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
        }
        */
    }
}
