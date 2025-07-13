package avance.pkg2;
public class Cliente {
    
    String nombre;
    String cedula;
    String direccion;

    public Cliente(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

     @Override
     public String toString() {
        return nombre + " - " + cedula;
    }
   
   
}

