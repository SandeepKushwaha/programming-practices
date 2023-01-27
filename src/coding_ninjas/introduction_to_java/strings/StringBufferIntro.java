package coding_ninjas.introduction_to_java.strings;

import java.util.Arrays;

public class StringBufferIntro {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Abc");
        System.out.println(stringBuffer);
        stringBuffer.setCharAt(0, 'a');
        System.out.println(stringBuffer);
        stringBuffer.append('d');
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.substring(2));
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.deleteCharAt(3));
        StringBuffer stringBuffer1 = stringBuffer.append("ABC");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.replace(2, 3, "xyz"));
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.indexOf("yz"));
        System.out.println(stringBuffer.compareTo(stringBuffer1));
        System.out.println(stringBuffer.isEmpty());
        System.out.println(stringBuffer.length());
        System.out.println("StringBuffer chars ascii array : " + stringBuffer.chars().toArray());
        System.out.println(stringBuffer.chars().toArray()[0]);
        System.out.println(stringBuffer.chars().toArray()[3]);
        System.out.println(Arrays.toString(stringBuffer.chars().toArray()));
    }
}
