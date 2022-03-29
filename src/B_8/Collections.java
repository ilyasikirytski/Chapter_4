package B_8;

import java.util.List;
import java.util.function.Function;

public class Collections {
    public static <T> int sumBy(List<T> items, Function<? super T, Integer> keyExtractor) {
        int result = 0;
        for (T item : items) {
            result += keyExtractor.apply(item);
        }
        return result;
    }
}
