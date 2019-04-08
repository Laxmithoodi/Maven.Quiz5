package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        final Set<String> result = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            // expanding even length palindromes:
            expandPalindromes(result, string, i, i + 1);
            // expanding odd length palindromes:
            expandPalindromes(result, string, i, i);
        }
        return result.toArray(new String[0]);

        //return null;
    }

    public static void expandPalindromes(final Set<String> result, final String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            result.add(s.substring(i, j + 1));
            i--;
            j++;
        }

    }

    public static Boolean isPalindrome(String string) {
        StringBuffer sb = new StringBuffer(string);


        return sb.reverse().toString().equals(string);
    }

    public static String reverseString(String string) {
        StringBuffer sb = new StringBuffer(string);
        return sb.reverse().toString();


    }
}
