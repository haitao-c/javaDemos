package chap3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Predicate<T>
 *     boolean test(T t)
 *
 * Consumer<T>
 *     void accept(T t)
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        PredicateTest2 predicateTest2 = new PredicateTest2();
        List<Integer> result = predicateTest2.conditionFilter(list,integer -> integer > 5);
        result.forEach(System.out::println);   //方法引用
    }

    public List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
