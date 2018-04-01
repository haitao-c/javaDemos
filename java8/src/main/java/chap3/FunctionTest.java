package chap3;

import java.util.function.Function;

/**
 * Function<T,R>
 * <p>
 * R apply(T t)
 */
public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();

        int result2 = functionTest.compute(5, num -> num + 2);
        int result3 = functionTest.compute(5, num -> num * 2);
        System.out.println(result2);
        System.out.println(result3);
    }

    public int compute(int i, Function<Integer, Integer> function) {
        Integer result = function.apply(i);
        return result;

    }

}
