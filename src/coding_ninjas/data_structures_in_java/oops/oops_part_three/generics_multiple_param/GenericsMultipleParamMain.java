package coding_ninjas.data_structures_in_java.oops.oops_part_three.generics_multiple_param;

public class GenericsMultipleParamMain {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "ABC");
        pair.setFirst(15);
        pair.setSecond("XYZ");

        System.out.println(pair);
    }
}
