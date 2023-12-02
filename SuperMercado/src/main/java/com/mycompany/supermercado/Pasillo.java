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
    private String nombre;
    private Producto[] productos; // Usaremos un array para almacenar los productos en el pasillo
    private static final int CAPACIDAD_PASILLO = 10;

    public Pasillo(String nombre) {
        this.nombre = nombre;
        this.productos = new Producto[CAPACIDAD_PASILLO];
    }

    // Método para agregar un producto al pasillo
    public void agregarProducto(Producto producto, int posicion) {
        if (posicion >= 0 && posicion < CAPACIDAD_PASILLO) {
            if (productos[posicion] == null) {
                productos[posicion] = producto;
                JOptionPane.showMessageDialog(null, "Producto agregado al pasillo " + nombre + " en la posición " + posicion);
            } else {
                JOptionPane.showMessageDialog(null, "La posición en el pasillo ya está ocupada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Posición no válida en el pasillo.");
        }
    }

    // Método para retirar un producto del pasillo
    public void retirarProducto(int posicion) {
        if (posicion >= 0 && posicion < CAPACIDAD_PASILLO) {
            if (productos[posicion] != null) {
                productos[posicion] = null;
                JOptionPane.showMessageDialog(null, "Producto retirado del pasillo " + nombre + " en la posición " + posicion);
            } else {
                JOptionPane.showMessageDialog(null, "No hay un producto en la posición especificada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Posición no válida en el pasillo.");
        }
    }

    // Método para mostrar la organización del pasillo
    public void mostrarOrganizacion() {
        StringBuilder organizacion = new StringBuilder("Organización del Pasillo " + nombre + ":\n");
        for (int i = 0; i < CAPACIDAD_PASILLO; i++) {
            organizacion.append("Posición ").append(i).append(": ");
            if (productos[i] != null) {
                organizacion.append(productos[i].getNombre());
            } else {
                organizacion.append("Vacía");
            }
            organizacion.append("\n");
        }
        JOptionPane.showMessageDialog(null, organizacion.toString());
    }
}

    // Método para mostrar la organización del pasillo con existencias
    public void mostrarOrganizacionConExistencias() {
        StringBuilder organizacion = new StringBuilder("Organización del Pasillo " + nombre + ":\n");
        for (int i = 0; i < CAPACIDAD_PASILLO; i++) {
            organizacion.append("Posición ").append(i).append(": ");
            if (productos[i] != null) {
                organizacion.append(productos[i].getNombre());
                if (productos[i].getExistencias() == 0) {
                    organizacion.append(" (R)");
                }
            } else {
                organizacion.append("Vacía");
            }
            organizacion.append("\n");
        }
        JOptionPane.showMessageDialog(null, organizacion.toString());
    }
}
