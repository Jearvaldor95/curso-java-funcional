package interfacesFuncionales003;

@FunctionalInterface
public interface Validador<T> {

    boolean validar(T valor);
}
