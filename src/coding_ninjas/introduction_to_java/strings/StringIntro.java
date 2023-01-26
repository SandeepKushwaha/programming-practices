package coding_ninjas.introduction_to_java.strings;

public class StringIntro {
    public static void main(String[] args) {
        char[] chars = {'I', 'L', 'o', 'v', 'e', ' ', 't', 'o', ' ', 'C', 'o', 'd', 'e'};
        String str = "I Love to Code";
        String str2 = " and make awesome program.";
        String emptyString = "";

        System.out.println(chars);
        System.out.println(str);
        System.out.println();
        System.out.println(chars.length); // length is property of array
        System.out.println(str.length()); // length() is method in string
        System.out.println(chars[4]);
        System.out.println(str.charAt(4));
        System.out.println(emptyString.length());
        // The String class length method returns an int,
        // the maximum length that would be returned by the method would be Integer.MAX_VALUE, which is 2^31 - 1,
        // which is equivalent to 2,14,74,83,647.

        System.out.println(str + str2);

        String concat = str.concat(str2);
        System.out.println(concat);

        String strDuplicate = str;

        System.out.println(str.equals(strDuplicate));
        System.out.println(str.compareTo("I Love to Code."));
        System.out.println(str.contains("love"));
        System.out.println(str.substring(7));
        System.out.println(str.substring(2, 6));
        System.out.println(str.substring(7).length());


        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
