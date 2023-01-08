package coding_ninjas.basic_of_java.BasicIO;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120300/offering/1459164
 *
 * */

class PrintNameAndAge {
    public static void main(String[] args) {

        // Write code here
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("The name of the person is " + name + " and the age is " + age + ".");
    }
}
