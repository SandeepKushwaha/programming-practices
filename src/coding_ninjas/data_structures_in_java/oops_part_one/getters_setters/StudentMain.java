package coding_ninjas.data_structures_in_java.oops_part_one.getters_setters;


public class StudentMain {
    public static void main(String[] args) {
        Student anil = new Student();
        Student ravi = new Student();

        System.out.println(anil);
        System.out.println(ravi);
        System.out.println();
        System.out.println("name: " + anil.name + ", roll number: " + anil.getRollNumber());
        System.out.println();

        anil.name = "anil kumar";
        anil.setRollNumber(2022_0001);
        System.out.println("name: " + anil.name + ", roll number: " + anil.getRollNumber());

        ravi.name = "ravi mishra";
        ravi.setRollNumber(-2022_0024);
        System.out.println("name: " + ravi.name + ", roll number: " + ravi.getRollNumber());
    }
}
