package com.mycompany.supermercado;

import java.util.Date;
import java.util.List;

public class Reportes {
    private SuperMercado SuperMercado;

    public Reportes(SuperMercado SuperMercado) {
        this.SuperMercado = SuperMercado;
    }

    public void generarReporteProductosDisponibles() {
        for (Producto producto : SuperMercado.getProductosDisponibles()) {
            System.out.println(producto);
        }
    }

    public void generarReporteOrganizacionPasillos() {
        for (int i = 0; i < SuperMercado.getPasillos().length; i++) {
            SuperMercado.getPasillos()[i].mostrarOrganizacion();
        }
    }
    
    public static void generarReporteCaducidad(List<Producto> listaProductos) {
    Date fechaActual = new Date(); // Obtener la fecha actual

    for (Producto producto : listaProductos) { // Recorrer la lista de productos
        Date fechaCaducidad = producto.getFechaCaducidad(); // Obtener la fecha de caducidad del producto actual

        // Calcular la diferencia en milisegundos entre la fecha de caducidad y la fecha actual
        long diffTiempo = fechaCaducidad.getTime() - fechaActual.getTime();
        long diffDias = diffTiempo / (1000 * 60 * 60 * 24); // Convertir la diferencia a días

        // Verificar si el producto está próximo a vencer (dentro de los próximos 30 días)
        if (diffDias <= 30 && diffDias >= 0) {
            // Imprimir un mensaje indicando que el producto está próximo a vencer junto con su nombre y fecha de caducidad
            System.out.println("Producto próximo a vencer: " + producto.getNombre() + ", Fecha de Caducidad: " + producto.getFechaCaducidad());
        }
    }
}


    
}
