package avance.pkg2;

import javax.swing.*;
import java.util.*;

public class Avance2 {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<Producto> productos = new ArrayList<>();

    
    public static void main(String[] args) {
        usuarios.add(new Usuario("admin", "1234"));
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }
}