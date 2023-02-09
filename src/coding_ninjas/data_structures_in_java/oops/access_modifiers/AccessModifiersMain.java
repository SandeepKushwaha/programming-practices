package coding_ninjas.data_structures_in_java.oops.access_modifiers;

public class AccessModifiersMain {
    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        // am.privateVariable = 1; // Not visible for any outside area;
        am.packageAccessibleVariable = 10;
        am.protectedVariable = 20;
        am.publicVariable = 40;

        System.out.println(am);
        am.accessVariablesToPrint(); // accessVariablesToPrint() method have default access modifier
    }

    
}
