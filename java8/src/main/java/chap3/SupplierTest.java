package chap3;

import java.util.function.Supplier;

/**
 * Supplier<T>
 *     T get()
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = String::new;
        String s = supplier.get();
    }
}
