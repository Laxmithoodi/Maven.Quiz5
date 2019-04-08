package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable {

   List<String> word;
    public SimpleStringGroup() {
        this.word = new ArrayList<>();

    }

    public Integer count() {

        return word.size();
    }

    public void insert(String string) {
        word.add(string);
    }

    public Boolean has(String string) {
        return null;
    }

    public String fetch(int indexOfValue) {

        return word.get(indexOfValue);
    }

    public void delete(String string) {
        word.add(string);
       // word.remove(string);
    }

    public void clear() {
        word.clear();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
