package com.mycompany.menuprincipal;
/**
 *
 * @author Usuario
 */
public class Reportes {
    private Supermercado supermercado;

    public Reportes(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    public void generarReporteProductosDisponibles() {
        for (Producto producto : supermercado.getProductosDisponibles()) {
            System.out.println(producto);
        }
    }

    public void generarReporteOrganizacionPasillos() {
        for (int i = 0; i < supermercado.getPasillos().length; i++) {
            supermercado.getPasillos()[i].mostrarOrganizacion();
        }
    }    
}
