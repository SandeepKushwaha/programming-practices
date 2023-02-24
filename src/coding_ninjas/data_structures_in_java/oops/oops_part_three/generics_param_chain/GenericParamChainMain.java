package coding_ninjas.data_structures_in_java.oops.oops_part_three.generics_param_chain;

public class GenericParamChainMain {

    public static void main(String[] args) {
        Pair<String, Integer> innerPair = new Pair<>("ABC", 100);
        Pair<Pair<String, Integer>, String> pair = new Pair<>();
        pair.setFirst(innerPair);
        pair.setSecond("pair");

        System.out.println(innerPair);
        System.out.println();
        System.out.println(pair);
        System.out.println();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println();
        System.out.println(pair.getFirst().getFirst());
        System.out.println(pair.getFirst().getSecond());
    }
}
