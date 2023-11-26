/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario xan
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