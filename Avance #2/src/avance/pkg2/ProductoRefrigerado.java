package avance.pkg2;
public class ProductoRefrigerado extends Producto {
    double temperatura;

    public ProductoRefrigerado(String nombre, String codigo, double precio, int stock, double temperatura) {
        super(nombre, codigo, precio, stock);
        this.temperatura = temperatura;
    }

    @Override
    public double calcularPrecio() {
        return precio + 0.5;
    }
}

