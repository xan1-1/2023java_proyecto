package com.mycompany.supermercado;


/**SuperMercado superMercado = new SuperMercado(//LLENAR CUANDO HAGAN LOS REPORTES/);
        Reportes reportes = new Reportes(superMercado);

        // Menú principal
      int opcion;
        do {
            String input = JOptionPane.showInputDialog(
                    "Menú de Reportes:\n" +
                            "1. Reporte de Productos Disponibles\n" +
                            "2. Reporte de Organización de Pasillos\n" +
                            "3. Reporte de Caducidad\n" +
                            "4. Salir\n" +
                            "Seleccione una opción:");

          
            opcion = Integer.parseInt(input);

           
            switch (opcion) {
                case 1:
                    reportes.generarReporteProductosDisponibles();
                    break;
                case 2:
                    reportes.generarReporteOrganizacionPasillos();
                    break;
                case 3:
                   
                    reportes.generarReporteCaducidad(//LLENAR CUANDO HAGAN EL MODULO DE REPORTES//);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);
    }
}/**


    
import java.util.Date;
import java.util.List;

public class Reportes {
    private SuperMercado SuperMercado;

    public Reportes(SuperMercado SuperMercado) {
        this.SuperMercado = SuperMercado;
    }

    public void generarReporteProductosDisponibles() {
        StringBuilder reporte = new StringBuilder("Reporte de Productos No Organizados:\n");

        for (Producto producto : superMercado.getProductosDisponibles()) {
            if (!estaOrganizado(producto)) {
                reporte.append(producto).append("\n");
            }
        }

        if (reporte.length() > 0) {
            JOptionPane.showMessageDialog(null, reporte.toString(), "Productos No Organizados", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Todos los productos están organizados en pasillos.", "Productos No Organizados", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void generarReporteOrganizacionPasillos() {
        StringBuilder reporte = new StringBuilder("Reporte de Organización de Pasillos:\n\n");
          //informe para el producto visual.
         for (Pasillo pasillo : superMercado.getPasillos()) {
            reporte.append(pasillo.obtenerOrganizacionVisual()).append("\n\n");
        }

        //informe para productos registrados
        for (Pasillo pasillo : superMercado.getPasillos()) {
            reporte.append(pasillo.obtenerProductosRegistrados()).append("\n\n");
        }
        mostrarMensajeEnVentana(reporte.toString());
    }
        private void mostrarMensajeEnVentana(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
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
