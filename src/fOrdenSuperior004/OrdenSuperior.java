package fOrdenSuperior004;

import interfacesFuncionales003.Operaciones;
import interfacesFuncionales003.Validador;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class OrdenSuperior {

    public static void main(String[] args) {

        int resultado = operar(3, 7, (a, b) -> a * b);
        System.out.println(resultado);

        boolean emailValido =  validar("valdoring@gmail.com", email-> email.contains("@"));
        System.out.println(emailValido);

        Function<Integer, Integer> porCuatro = multiplicador(4);
        System.out.println(porCuatro.apply(28));
    }

    static int operar(int a, int b, Operaciones operaciones){
        return operaciones.calcular(a, b);
    }

    static boolean validar(String valor, Validador<String> validar){
        return validar.validar(valor);
    }

    static Function<Integer, Integer> multiplicador(int factor){
        return x -> x * factor;
    }


    /* Crea una función transformarLista que reciba una lista de strings y una función
    para transformarlas. Usa Function<String, String> y aplica la transformación a cada elemento.
    */
}
