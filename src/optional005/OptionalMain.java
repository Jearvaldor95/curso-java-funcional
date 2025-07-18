package optional005;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Jesus", 26, "jesus@gmail.com");

        Optional<Usuario> usuarioOptional = Optional.ofNullable(usuario);
        usuarioOptional.ifPresent(u -> System.out.println(u.nombre()));

        Usuario usuario1 = usuarioOptional.orElse(new Usuario("Pedro", 50, "pedro@gmail.com"));
        System.out.println(usuario1);

        Usuario usuario2 = usuarioOptional.orElseGet(()-> crearUsuario());
        System.out.println(usuario2);

        //Usuario usuario3 = usuarioOptional.orElseThrow(()-> new RuntimeException("Usuario no existe"));
        //System.out.println(usuario3);

        Optional<String> nombreMayus = usuarioOptional.map(u -> u.nombre().toUpperCase());
        nombreMayus.ifPresent(u -> System.out.println(u));

        Optional<Boolean> existeUsuario = existeUsuario("Ana");
        existeUsuario.ifPresent(u -> System.out.println(u));

        Optional<Usuario> usuario4 = buscarUsuarioPorNombre("Ana");
        usuario4.ifPresent(u -> System.out.println(u));
    }

    static Usuario crearUsuario(){
        return new Usuario("Ana", 30, "ana@gmail.com");
    }

    static Optional<Boolean> existeUsuario(String nombre){
        return Optional.of(crearUsuario().nombre().equals(nombre));
    }

    static Optional<Usuario> buscarUsuarioPorNombre(String nombre){
        return Optional.of(crearUsuario()).filter(usuario -> usuario.nombre().equals(nombre));
    }

    /* Crea una función encontrarUsuario que reciba un Optional<Usuario> y devuelva el nombre del usuario si está presente,
       o un mensaje predeterminado si no. */
}
