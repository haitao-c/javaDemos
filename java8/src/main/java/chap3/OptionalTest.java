package chap3;

import java.util.Optional;

/**
 * public void ifPresent(Consumer<? super T> consumer) {
 if (value != null)
 consumer.accept(value);
 }
 *
 *
 * public T orElseGet(Supplier<? extends T> other) {
 return value != null ? value : other.get();
 }
 */
public class OptionalTest {
    public static void main(String[] args){
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.orElseGet(()->"welcome"));

        String str2="hello";
        Optional<String> optional2 = Optional.ofNullable(str2);
        optional2.ifPresent(s->System.out.println(s));

    }
}
