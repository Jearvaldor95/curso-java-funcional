package metodoReference006;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MetodoReference {

    public static void main(String[] args) {
        // Referencia a metodos static
        Function<String, String> mensaje = MetodoReference::imprimir;
        System.out.println(mensaje.apply("referencia a metodo static"));

        Function<String, Integer> convertir = Integer::parseInt;
        int resultado = convertir.apply("23");
        System.out.println(resultado);

        // Referncia a instancia de un objeto
        Lenguaje lenguaje = new Lenguaje();
        Consumer<String> consumer = lenguaje::ejecutar;
        consumer.accept("Java");

        // Referencia a instancia de una clase

        List<String> lenguajes = Arrays.asList("java", "python", "php");

        lenguajes.stream().map(String::toUpperCase).forEach(System.out::println);

        //Referencia a contructor

        Function<String, Lenguaje> lenguajeFunction = Lenguaje::new;
        Lenguaje lenguaje1 = lenguajeFunction.apply("Python");
        System.out.println(lenguaje1);


        List<Lenguaje> lenguajeList = lenguajes
                .stream().map(Lenguaje::new).collect(Collectors.toList());

        System.out.println(lenguajeList);



    }

    public static String imprimir(String mensaje){
        return "Hola "+mensaje;
    }
}
