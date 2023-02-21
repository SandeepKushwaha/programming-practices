package coding_ninjas.data_structures_in_java.oops.oops_part_three.abstract_keyword;

public class AbstractKeywordMain {
    public static void main(String[] args) {
        /*

         abstract class constructor need to define the abstract member.
         otherwise we can't create the object of the class
         for that there is two method i.e.
         1. create a child class and define the member there.
         2. create an inline class to complete the member definition.

         Vehicle vehicle = new Vehicle();

        */

        // first approach.

        BMW bmw = new BMW("Green", 180, 5);
        bmw.print();
        System.out.println(bmw.getCompanyName() + " isMotorized: " + bmw.isMotorized());
        System.out.println();

        Bicycle bicycle = new Bicycle("Hero", "black, white and gray");
        bicycle.print();
        System.out.println(bicycle.getCompanyName() + " isMotorized: " + bicycle.isMotorized());
        System.out.println();

        // second approach
        Vehicle vehicle = new Vehicle("Red", 100) {
            @Override
            public boolean isMotorized() {
                return true;
            }

            @Override
            public String getCompanyName() {
                return "My Company";
            }
        };
        vehicle.print();
    }
}