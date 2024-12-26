/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {

    private int subtraction(String val) {
        switch (val) {
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
            default:
                return 0;
        }
    }

    private int getVal(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // if there is possiblity of subtraction
            if ((ch == 'I' || ch == 'X' || ch == 'C') && i + 1 < s.length()) {
                int val = subtraction(s.substring(i, i + 2));
                if (val > 0) {
                    ans += val;
                    i++;
                    continue;
                }
            }
            ans+= getVal(ch);
        }

        return ans;
    }

    // another approach using maps, little concise

    // public int romanToInt(String s) {
    //     Map<Character, Integer> m = new HashMap<>();
        
    //     m.put('I', 1);
    //     m.put('V', 5);
    //     m.put('X', 10);
    //     m.put('L', 50);
    //     m.put('C', 100);
    //     m.put('D', 500);
    //     m.put('M', 1000);
        
    //     int ans = 0;
        
    //     for (int i = 0; i < s.length(); i++) {
    //         if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
    //             ans -= m.get(s.charAt(i));
    //         } else {
    //             ans += m.get(s.charAt(i));
    //         }
    //     }
        
    //     return ans;
    // }
}
// @lc code=end
