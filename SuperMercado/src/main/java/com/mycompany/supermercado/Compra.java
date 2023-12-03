import com.mycompany.supermercado.Pasillo;
import com.mycompany.supermercado.Producto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Compra {
    private static int comprasTotalesRealizadas = 0;
    private String nombreCliente;
    private String cedulaCliente;
    private List<Producto> productosComprados;
    private Pasillo pasillo;

    public Compra(String nombreCliente, String cedulaCliente, Pasillo pasillo) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.productosComprados = new ArrayList<>();
        this.pasillo = pasillo;
    }

    public void agregarProducto(Producto producto) {
        productosComprados.add(producto);
    }

    public void realizarCompra(List<Producto> productosDisponibles) {
        int maxProductos = 7;
        int productosSeleccionados = 0;

        if (comprasTotalesRealizadas >= 50) {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite total de compras en el programa.");
            return;
        }

        while (productosSeleccionados < maxProductos) {
            int pasilloIndex = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el pasillo (0-9):"));

            if (pasilloIndex < 0 || pasilloIndex >= productosDisponibles.size()) {
                JOptionPane.showMessageDialog(null, "Pasillo inválido.");
                break;
            }

            Pasillo pasillo = productosDisponibles.get(pasilloIndex).getPasillo();

            String productosDisponiblesStr = "Productos disponibles en el pasillo " + pasillo.getNombre() + ":\n";

            for (int i = 0; i < Pasillo.getCAPACIDAD_PASILLO(); i++) {
                Producto producto = pasillo.getProductos()[i];
                if (producto != null) {
                    productosDisponiblesStr += i + ": " + producto.getNombre() + "\n";
                }
            }

            int posicion = Integer.parseInt(JOptionPane.showInputDialog(productosDisponiblesStr + "Seleccione la posición del producto (0-9):"));

            Producto seleccionado = pasillo.getProductos()[posicion];

            if (seleccionado == null) {
                JOptionPane.showMessageDialog(null, "Producto no disponible en la posición especificada.");
                continue;
            }

            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a comprar:"));

            if (cantidad <= 0 || cantidad > seleccionado.getExistencias()) {
                JOptionPane.showMessageDialog(null, "Cantidad inválida.");
                continue;
            }

            Producto productoCompra = new Producto(seleccionado.getNombre(), seleccionado.getCategoria(), seleccionado.getPrecio(), cantidad, seleccionado.getFechaCaducidad());
            productosComprados.add(productoCompra);

            seleccionado.setExistencias(seleccionado.getExistencias() - cantidad);
            productosSeleccionados++;

            int continuar = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro producto?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (continuar != JOptionPane.YES_OPTION) {
                break;
            }
        }

        if (productosSeleccionados > 0) {
            double totalPagar = calcularTotalCompra();
            int confirmacion = JOptionPane.showConfirmDialog(null, "Total a pagar: " + totalPagar + "\n¿Desea continuar con la compra?", "Confirmación de compra", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                comprasTotalesRealizadas++;
                // Aquí puedes realizar las acciones necesarias para completar la compra
            } else {
                cancelarCompra();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionaron productos para la compra.");
        }
    }

    private double calcularTotalCompra() {
        double total = 0;
        for (Producto producto : productosComprados) {
            total += producto.getPrecio() * producto.getExistencias();
        }
        return total;
    }

    private void cancelarCompra() {
        JOptionPane.showMessageDialog(null, "Compra cancelada. No se ha realizado ningún cargo.");
        // Aquí se cancela la compra sin modificar lo seleccionado.
    }
}
