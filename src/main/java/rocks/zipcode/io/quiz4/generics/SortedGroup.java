package rocks.zipcode.io.quiz4.generics;



import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    Set<_> set = new TreeSet<>();
    @Override
    public void insert(_ value) {
        set.add(value);
    }

    @Override
    public void delete(_ value) {
        set.remove(value);
    }

    public Integer indexOf(_ value) {


        int index =0;
        for( _ element : set){
            if(value.equals(element))
                return index;
            index++;
        }
        return -1;
    }
}
