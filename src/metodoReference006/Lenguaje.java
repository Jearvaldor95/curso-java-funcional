package metodoReference006;

public class Lenguaje {

    String nombre;

    public Lenguaje(String nombre) {
        this.nombre = nombre;
    }

    public Lenguaje() {
    }

    @Override
    public String toString() {
        return "Lenguaje{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void ejecutar(String nombre){
        System.out.println("Hola "+nombre);
    }
}
