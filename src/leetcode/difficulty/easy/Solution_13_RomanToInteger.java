package leetcode.difficulty.easy;

/**
 * <p>
 * <b>Problem Name:</b> Roman to Integer <br/>
 *
 * <b>Problem Link:</b> <a href="https://leetcode.com/problems/roman-to-integer/">Roman to Integer</a><br/>
 *
 * <b>Difficulty:</b> Easy<br/>
 *
 * <b>Tags:</b>     Math,
 *                  String,
 *                  Hash Table
 * </p>
 */
public class Solution_13_RomanToInteger {

    public static void main(String[] args) {
        Solution_13_RomanToInteger solve = new Solution_13_RomanToInteger();

        System.out.println(solve.romanToInt("III"));
        System.out.println(solve.romanToInt("XI"));
        System.out.println(solve.romanToInt("LVIII"));
        System.out.println(solve.romanToInt("MCMXCIV"));
        System.out.println(solve.romanToInt(""));
    }

    /**
     * <p>
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * <br/>
     * <br/>
     * Symbol   -       Value      <br/>
     * I        -       1          <br/>
     * V        -       5          <br/>
     * X        -       10         <br/>
     * L        -       50         <br/>
     * C        -       100        <br/>
     * D        -       500        <br/>
     * M        -       1000       <br/>
     * <br/>
     * For example, 2 is written as II in Roman numeral, just two ones added together.
     * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
     * which is XX + V + II.
     * <br/><br/>
     * Roman numerals are usually written largest to smallest from left to right.
     * However, the numeral for four is not IIII. Instead,
     * the number four is written as IV. Because the one is before the five
     * we subtract it making four. The same principle applies to the number nine,
     * which is written as IX. There are six instances where subtraction is used:
     * </p>
     *
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9. <br/>
     * X can be placed before L (50) and C (100) to make 40 and 90. <br/>
     * C can be placed before D (500) and M (1000) to make 400 and 900. <br/>
     * <br/>
     * Given a roman numeral, convert it to an integer.
     * </p>
     */
    public int romanToInt(String s) {
        // Optimized method to solve this problem.
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
        /* General Method to solve the problem.
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (i < s.length() - 1 && value < map.get(s.charAt(i+1)))
                result -= value;
            else
                result += value;
        }

        return result;
        */
    }
}
