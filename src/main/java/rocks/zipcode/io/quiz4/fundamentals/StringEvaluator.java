package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> list = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String sub = string.substring(i, j);
                list.add(sub);
            }
        }

        String[] all = new String[list.size()];
        return list.toArray(all);
    }


    public static String[] getCommonSubstrings(String string1, String string2) {




        return null;
    }

    public static String getLargestCommonSubstring(String str1, String str2) {

        int l1 = str1.length();
        int l2 = str2.length();

        int[][] arr = new int[l1 + 1][l2 + 1];
        int len = 0, pos = -1;

        for (int x = 1; x < l1 + 1; x++)
        {
            for (int y = 1; y < l2 + 1; y++)
            {
                if (str1.charAt(x - 1) == str2.charAt(y - 1))
                {
                    arr[x][y] = arr[x - 1][y - 1] + 1;
                    if (arr[x][y] > len)
                    {
                        len = arr[x][y];
                        pos = x;
                    }
                }
                else
                    arr[x][y] = 0;
            }
        }

        return str1.substring(pos - len, pos);
    }

        //return null;

}
