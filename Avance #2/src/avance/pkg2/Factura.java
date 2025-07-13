package avance.pkg2;

import java.io.*;
import java.util.*;

public class Factura {
    Cliente cliente;
    ArrayList<Producto> productos;
    ArrayList<Integer> cantidades;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        productos = new ArrayList<>();
        cantidades = new ArrayList<>();
    }

    public void agregarProducto(Producto p, int cantidad) {
        productos.add(p);
        cantidades.add(cantidad);
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).calcularPrecio() * cantidades.get(i);
        }
        return total;
    }

    public void guardarFactura() {
        try {
            String nombreArchivo = "factura_" + cliente.cedula + ".txt";
            PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo));
            writer.println("Factura para: " + cliente.nombre);
            for (int i = 0; i < productos.size(); i++) {
                Producto p = productos.get(i);
                writer.println(p.nombre + " x" + cantidades.get(i) + " - $" + (p.calcularPrecio() * cantidades.get(i)));
            }
            writer.println("Total: $" + calcularTotal());
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la factura");
        }
    }
}

}
