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


    // Método para mostrar la organización del pasillo con existencias
 public void mostrarOrganizacionVisual() {
        StringBuilder organizacion = new StringBuilder("Organización Visual del Pasillo " + nombre + ":\n");
        for (int i = 0; i < CAPACIDAD_PASILLO; i++) {
            if (productos[i] != null) {
                organizacion.append("X");
                if (productos[i].getExistencias() == 0) {
                    organizacion.append("R");
                }
            } else {
                organizacion.append("-");
            }
            organizacion.append(" ");
        }
        mostrarMensajeEnVentana(organizacion.toString());
    }
 public void mostrarProductosRegistrados() {
        StringBuilder productosRegistrados = new StringBuilder("Productos Registrados en el Pasillo " + nombre + ":\n\n");
        for (Producto producto : productos) {
            if (producto != null) {
                productosRegistrados.append(producto).append("\n\n");
            }
        }
        mostrarMensajeEnVentana(productosRegistrados.toString());
    }
