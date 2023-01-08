package coding_ninjas.basic_of_java.BasicIO;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120300/offering/1459163
 *
 * */


import java.util.Scanner;

class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int breadth = scan.nextInt();
        System.out.println(length * breadth);
    }
}