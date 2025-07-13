package avance.pkg2;
public class Producto {
    
    
    String nombre;
    String codigo;
    double precio;
    int stock;

    public Producto(String nombre, String codigo, double precio, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }

    public double calcularPrecio() {
        return precio;
    }

    @Override
     public String toString() {
        return nombre + " ($" + precio + ")";
    }
   
}


