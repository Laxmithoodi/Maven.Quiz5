package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    StringBuilder sb  = new StringBuilder();
    String word;

    public StringAssembler(Character delimeter) {
        sb.append(delimeter);
    }

    public StringAssembler append(String str) {


        return null;
    }

    public String assemble() {

        return String.valueOf(sb.append(word));
    }
}
