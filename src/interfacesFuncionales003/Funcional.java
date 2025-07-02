package interfacesFuncionales003;

public class Funcional {

    public static void main(String[] args) {

       Operaciones producto = (a, b) -> a * b;
       System.out.println(producto.calcular(4, 8));

       Validador<String> validarEmail = email -> email.contains("@");
       System.out.println(validarEmail.validar("valdoring@gmail.com"));

       /* Crear una interface funcional llamada Transformador<T> que reciba un valor y
          lo transforme en otro */


    }
}
