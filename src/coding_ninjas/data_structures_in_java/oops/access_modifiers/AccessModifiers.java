package coding_ninjas.data_structures_in_java.oops.access_modifiers;

public class AccessModifiers {
    private int privateVariable; // private modifier == accessible only in same class
    int packageAccessibleVariable; // default modifier == accessible for
    protected int protectedVariable; // protected modifier == only child can access
    public int publicVariable; // public modifier == any one can access

    void accessVariablesToPrint() {
        // all variable is accessible here
        // privateVariable = 1; // private variable accessible in the class
        System.out.println(privateVariable);
        System.out.println(packageAccessibleVariable);
        System.out.println(protectedVariable);
        System.out.println(publicVariable);
    }
}