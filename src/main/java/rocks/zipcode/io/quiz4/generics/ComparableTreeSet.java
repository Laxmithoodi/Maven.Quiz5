package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<T> extends TreeSet<T> implements Comparable <ComparableTreeSet<T>>{
    public ComparableTreeSet(T... arr) {
        for(T el : arr){
            add(el);
        }
    }


    public ComparableTreeSet() {
    }


    @Override
    public int compareTo(ComparableTreeSet<T> o) {

        return toString().compareTo(o.toString());
    }


}
