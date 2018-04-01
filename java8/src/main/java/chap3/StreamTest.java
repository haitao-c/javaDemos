package chap3;

import java.util.Arrays;
import java.util.List;

/**
 * public interface Stream<T> extends BaseStream<T, Stream<T>> {

 Stream<T> filter(Predicate<? super T> predicate);

 <R> Stream<R> map(Function<? super T, ? extends R> mapper);

 void forEach(Consumer<? super T> action);
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","helloworld");
        list.stream().filter(s->s.length()>5).map(s->s.toUpperCase()).forEach(System.out::println);
    }

}
