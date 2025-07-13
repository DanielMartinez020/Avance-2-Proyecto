package avance.pkg2;

public class Usuario {
    String nombreUsuario;
    String contraseña;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public boolean autenticar(String usuario, String clave) {
        return nombreUsuario.equals(usuario) && contraseña.equals(clave);
    }
}

