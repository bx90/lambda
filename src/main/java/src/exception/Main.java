package src.exception;

import java.util.function.BiConsumer;

/**
 * Created by Boxiong on 7/25/17.
 */
public class Main {
    public static void main(String[] args) {
        int [] num = {1, 2, 3};
        int key = 0;

        calculate(num, key, wrapperLambda((v, k) -> System.out.println(v / k)));//(v, k) -> System.out.println(v / k)) this part alone is a BiConsumer<Integer, Integer>
    }

    private static void calculate(int[] nums, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : nums) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v,k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Exception at here.");
            }
        };
    }
}
