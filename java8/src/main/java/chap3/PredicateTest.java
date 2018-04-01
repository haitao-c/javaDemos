package chap3;

import java.util.function.Predicate;

/**
 * Predicate<T>
 *     boolean test(T t)
 */
public class PredicateTest {
    public static void main(String[] args){
        Predicate<String> predicate = s->s.length()>5;
        System.out.println(predicate.test("hello"));
    }
}
