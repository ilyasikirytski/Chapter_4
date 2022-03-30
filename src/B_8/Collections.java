package B_8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class Collections {
    public static <T> int sumBy(List<T> items, Function<? super T, Integer> keyExtractor) {
        int result = 0;
        for (T item : items) {
            result += keyExtractor.apply(item);
        }
        return result;
    }

//    public static <T, U extends Comparable<? super U>> Comparator<T> myComparator(Function<? super T, ? extends U> keyExtractor) {
//        Objects.requireNonNull(keyExtractor);
//        return (Comparator<T> & Serializable)
//                (o1, o2) -> keyExtractor.apply(o1).compareTo(keyExtractor.apply(o2));
//    }

    public static <T, U extends Comparable<? super U>> void mySort(List<T> list, Function<? super T, ? extends U> keyExtractor) {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                Objects.requireNonNull(keyExtractor);
                return keyExtractor.apply(o1).compareTo(keyExtractor.apply(o2));
            }
        });
    }
}
