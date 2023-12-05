package com.mycompany.menuprincipal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xan
 */
public class SuperMercado {
private List<Producto> productosDisponibles;
    private Pasillo[] pasillos;
    private Compra[] comprasRealizadas;
    private int totalCompras;

    public SuperMercado() {
        productosDisponibles = new ArrayList<>();
        pasillos = new Pasillo[10];
        String[] ArrayDeNombres = {"Frescos", "Granos", "Carniceria", "Abarrotes", "Cereales", "Limpieza", "Lacteos", "Panaderia", "Hogar", "Congelados"};
        for (int i = 0; i < pasillos.length; i++) {
            pasillos[i] = new Pasillo(ArrayDeNombres[i]);  
        }
        comprasRealizadas = new Compra[50]; // Límite de 50 compras
        totalCompras = 0;
    }

    // Obtener productos disponibles
    public List<Producto> getProductosDisponibles() {
        return productosDisponibles;
    }

    // Obtener pasillos
    public Pasillo[] getPasillos() {
        return pasillos;
    }

    // Registrar productos disponibles
    public void registrarProducto(Producto producto) {
        productosDisponibles.add(producto);
    }

    // Organizar producto en pasillo
    public void organizarProductoEnPasillo(Producto producto, int pasilloIndex, int posicion) {
        pasillos[pasilloIndex].organizarProducto(producto, posicion);
    }

    // Realizar compra de productos
    public void realizarCompra() {
        if (totalCompras < comprasRealizadas.length) {
            // Implementa la lógica para realizar una compra
        } else {
            System.out.println("Se ha alcanzado el límite de compras realizadas.");
        }
    }

    // Retirar un producto de un pasillo
    public void retirarProducto(int pasilloIndex, int posicion) {
        pasillos[pasilloIndex].retirarProducto(posicion);
    }

    // Implementa los métodos para generar reportes

    public static void main(String[] args) {
        SuperMercado SuperMercado = new SuperMercado();

        while (true) {
            // Implementa el menú principal
        }
    }
}
