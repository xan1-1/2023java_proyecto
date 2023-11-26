/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;
/**
 *
 * @author Usuario xan
 */
public class Pasillo {
    private Producto[] productosEnPasillo;

    public Pasillo() {
        productosEnPasillo = new Producto[10];
    }

    public void organizarProducto(Producto producto, int posicion) {
        if (posicion >= 0 && posicion < productosEnPasillo.length && productosEnPasillo[posicion] == null) {
            productosEnPasillo[posicion] = producto;
        } else {
            System.out.println("Posición ocupada o inválida en el pasillo.");
        }
    }

    public void retirarProducto(int posicion) {
        if (posicion >= 0 && posicion < productosEnPasillo.length && productosEnPasillo[posicion] != null) {
            productosEnPasillo[posicion] = null;
        } else {
            System.out.println("No hay un producto en la posición especificada.");
        }
    }

    public void mostrarOrganizacion() {
        StringBuilder pasilloInfo = new StringBuilder("Pasillo: ");
        for (int i = 0; i < productosEnPasillo.length; i++) {
            if (productosEnPasillo[i] == null) {
                pasilloInfo.append(" ");
            } else if (productosEnPasillo[i].getExistencias() == 0) {
                pasilloInfo.append("R");
            } else {
                pasilloInfo.append("X");
            }
        }
        System.out.println(pasilloInfo.toString());
    }
    }