import datos.UsuarioJDBC;
import domain.Usuario;

import java.util.List;

public class ManejoUsuarios {
    public static void main(String[] args) {
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        // Ejecutando el listado de usuarios

        List<Usuario> usuarios = usuarioJDBC.seleccionar();
        for (Usuario usuario : usuarios) {
            System.out.println("Usuario: " + usuario);
        }

        // Insertamos un nuevo usuario

//        Usuario usuario = new Usuario("Marco.m","123");
//        usuarioJDBC.insertar(usuario);

        // Modificamos un usuario existente

//        Usuario usuario = new Usuario(3,"Marco.m","456");
//        usuarioJDBC.actualizar(usuario);

        // Eliminar un usuario

        usuarioJDBC.eliminar(new Usuario(4));
    }
}
