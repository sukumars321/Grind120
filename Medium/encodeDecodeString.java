import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class encodeDecodeString {
    /*
     * @param strs: a list of strings
     * 
     * @return: encodes a list of strings to a single string.
     */

    public static String encode(List<String> strs) {

        if (strs.isEmpty()) {
            return "";
        }

        StringBuilder encodedString = new StringBuilder();
        for (String string : strs) {
            encodedString.append((char) string.length()).append(string);
        }

        return encodedString.toString();
    }

    /*
     * @param str: A string
     * 
     * @return: decodes a single string to a list of strings
     */
    public static List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> ans = new ArrayList<>();
        int len = str.length();
        int ind = 0;
        int size;
        while(ind < len){
            size = str.charAt(ind);
            ind++;
            ans.add(str.substring(ind, ind + size));
            ind += size;
        }

        return ans;
    }

    public static void main(String[] args) {

        // Test case 1: Empty list of strings
        List<String> strs1 = new ArrayList<>();
        String encoded1 = encode(strs1);
        System.out.println("Encoded string for empty list: " + encoded1);
        System.out.println("Decoded list: " + decode(encoded1));

        // Test case 2: Single string
        List<String> strs2 = Arrays.asList("Hello");
        String encoded2 = encode(strs2);
        System.out.println("\nEncoded string for single string: " + encoded2);
        System.out.println("Decoded list: " + decode(encoded2));

        // Test case 3: Multiple strings
        List<String> strs3 = Arrays.asList("Hello", "World", "This", "is", "a", "test");
        String encoded3 = encode(strs3);
        System.out.println("\nEncoded string for multiple strings: " + encoded3);
        System.out.println("Decoded list: " + decode(encoded3));

        // Test case 4: Strings with special characters
        List<String> strs4 = Arrays.asList("H#llo", "W#rld");
        String encoded4 = encode(strs4);
        System.out.println("\nEncoded string for strings with special characters: " + encoded4);
        System.out.println("Decoded list: " + decode(encoded4));

        // Test case 5: Empty strings
        List<String> strs5 = Arrays.asList("", "", "Test");
        String encoded5 = encode(strs5);
        System.out.println("\nEncoded string for list with empty strings: " + encoded5);
        System.out.println("Decoded list: " + decode(encoded5));

        // Test case 6: Long strings
        StringBuilder longStr = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            longStr.append("a");
        }
        List<String> strs6 = Arrays.asList(longStr.toString());
        String encoded6 = encode(strs6);
        System.out.println("\nEncoded string for list with a long string: " + encoded6.length());
        System.out.println("Decoded list: " + decode(encoded6));
    }
}
