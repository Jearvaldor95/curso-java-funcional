package introduccion001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Introduccion {

    public static void main(String[] args) {
        
        // convierte este código imperativo en funcional usando streams y map

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> cuadrados = new ArrayList<>();
        for (Integer numero : numeros) {
            cuadrados.add(numero * numero);
        }

        System.out.println(cuadrados);

    }
}
