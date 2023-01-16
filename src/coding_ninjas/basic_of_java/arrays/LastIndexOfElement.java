package coding_ninjas.basic_of_java.arrays;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120299/offering/1459175
 *
 * */
public class LastIndexOfElement {
    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        int number = scan.nextInt();
        int[] items = new int[number];

        for (int i = 0; i < items.length; i++) {
            items[i] = scan.nextInt();
        }

        int searchItem = scan.nextInt();
        boolean found = false;

        for (int i = items.length - 1; i >= 0; i--) {
            if (items[i] == searchItem) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(-1);
        }
    }
}
