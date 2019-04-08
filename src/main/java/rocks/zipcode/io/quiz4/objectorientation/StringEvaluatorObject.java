package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String input;
    public StringEvaluatorObject(String str) {
        this.input = str;
    }

    public String[] getAllSubstrings() {

        return StringEvaluator.getAllSubstrings(input);
    }
    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(input, secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {

        return StringEvaluator.getLargestCommonSubstring(input, secondInput);
    }
}
