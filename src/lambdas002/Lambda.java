package lambdas002;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda {

    public static void main(String[] args) {
        Runnable runnable = ()-> System.out.println("Hola lambda con runnable");
        runnable.run();

        Consumer<String> consumer = mensaje -> System.out.println("Hola lambda "+mensaje);
        consumer.accept("con consumer");

        BiFunction<Integer, Integer, Integer> biFunction =
                (a, b) -> a * b;

        System.out.println(biFunction.apply(4, 9));

        // Apartir de el siguiete codigo crea tu expresion lambda y conviertelo a funcional
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hola lambda con supplier";
            }
        };
        System.out.println(supplier.get());

    }
}
