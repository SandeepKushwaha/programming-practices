package coding_ninjas.data_structures_in_java.oops.oops_part_three.generics_intro;

public class GenericsMain {
    public static void main(String[] args) {
        IntegerPair integerPair = new IntegerPair(10, 12);
        System.out.println(integerPair.getFirst() + " " + integerPair.getSecond());

        // for this we need to create a new class for String type. or we can use generic class
        // StringPair pairString = new StringPair("a", "b");
        // also for this we need to create a new class for Double type. or we can use generic class
        // DoublePair pairDouble = new DoublePair(3.12, 8.3);

        Pair<Integer> intPair = new Pair<>(10, 20);
        Pair<String> stringPair = new Pair<>("A", "B");
        Pair<Double> doublePair = new Pair<>(3.12, 2.23);

        System.out.println(intPair);
        System.out.println(stringPair);
        System.out.println(doublePair);
        System.out.println();

        /* Warning on code without mention the type.

        Pair p = new Pair(10, 20);
        p.setFirst("AA");
        p.setSecond(10);

        System.out.println(p);
        String f = (String) p.getFirst();
        System.out.println(f);

        */
    }
}
