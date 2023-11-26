/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Usuario xan
 */
public class Producto {
    private static int nextId = 1;
    private int id;
    private String nombre;
    private Categoria categoria;
    private double precio;
    private int existencias;
    private Date fechaCaducidad;

    public Producto(String nombre, Categoria categoria, double precio, int existencias, Date fechaCaducidad) {
        this.id = nextId++;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.existencias = existencias;
        this.fechaCaducidad = fechaCaducidad;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Producto.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }   
    
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "ID: " + id + ", Nombre: " + nombre + ", Categoría: " + categoria + ", Precio: " + precio + ", Existencias: " + existencias + ", Fecha de Caducidad: " + sdf.format(fechaCaducidad);
    }

    int getExistencias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}