package coding_ninjas.data_structures_in_java.oops.oops_part_three.generics_methods;

public class Print {
    public static<T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
