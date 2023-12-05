package com.mycompany.menuprincipal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class Compra {
   private String nombreCliente;
    private String cedulaCliente;
    private List<Producto> productosComprados;

    public Compra(String nombreCliente, String cedulaCliente) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.productosComprados = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productosComprados.add(producto);
    }

    
}
