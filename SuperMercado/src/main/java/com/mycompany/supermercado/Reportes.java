/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;
/**
 *
 * @author Usuario xan
 */
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
}