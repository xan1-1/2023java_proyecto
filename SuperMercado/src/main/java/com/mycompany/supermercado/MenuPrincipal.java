/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Usuario xan
 */
public class MenuPrincipal {
  public static void main(String[] args) {
          SuperMercado supermercado = new SuperMercado(); // Debes crear una instancia de la clase Supermercado

        while (true) {
            String menu = "Menú Principal:\n" +
                    "1. Registrar productos disponibles\n" +
                    "2. Organizar producto en pasillo\n" +
                    "3. Realizar compra de productos\n" +
                    "4. Retirar un producto\n" +
                    "5. Módulo de reportes\n" +
                    "6. Salir";

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Nombre del producto:");
    Categoria categoria = (Categoria) JOptionPane.showInputDialog(null, "Categoría:", "Categoría", JOptionPane.QUESTION_MESSAGE, null, Categoria.values(), Categoria.Frescos);
    double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto:"));
    int existencias = Integer.parseInt(JOptionPane.showInputDialog("Existencias:"));
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date fechaCaducidad = null;
    try {
        fechaCaducidad = sdf.parse(JOptionPane.showInputDialog("Fecha de Caducidad (dd/MM/yyyy):"));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Fecha de caducidad inválida.");
        continue;
    }
    Producto nuevoProducto = new Producto(nombre, categoria, precio, existencias, fechaCaducidad);
    supermercado.registrarProducto(nuevoProducto);
                    break;
                case 2:
                     int pasilloIndex = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el pasillo (0-9):"));
    if (pasilloIndex < 0 || pasilloIndex >= supermercado.getPasillos().length) {
        JOptionPane.showMessageDialog(null, "Pasillo inválido.");
        break;
    }
    int posicion = Integer.parseInt(JOptionPane.showInputDialog("Posición en el pasillo (0-9):"));
    supermercado.organizarProductoEnPasillo(supermercado.getProductosDisponibles().get(0), pasilloIndex, posicion);
                    break;
                case 3:
                    supermercado.realizarCompra();
                    break;
                case 4:
                    int pasilloIndexRetirar = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el pasillo (0-9):"));
    if (pasilloIndexRetirar < 0 || pasilloIndexRetirar >= supermercado.getPasillos().length) {
        JOptionPane.showMessageDialog(null, "Pasillo inválido.");
        break;
    }
    int posicionRetirar = Integer.parseInt(JOptionPane.showInputDialog("Posición en el pasillo (0-9):"));
    supermercado.retirarProducto(pasilloIndexRetirar, posicionRetirar);
                    break;
                case 5:
                    // Submenú para el módulo de reportes
                    String submenu = "Módulo de Reportes:\n" +
                            "1. Reporte de productos disponibles\n" +
                            "2. Reporte de organización de pasillos\n" +
                            "3. Reporte de caducidad\n" +
                            "4. Reporte de resumen de compras\n" +
                            "5. Volver al menú principal";

                    int reporteOpcion = Integer.parseInt(JOptionPane.showInputDialog(submenu));

                    switch (reporteOpcion) {
                        case 1:
                            // Lógica para generar reporte de productos disponibles
                            break;
                        case 2:
                            // Lógica para generar reporte de organización de pasillos
                            break;
                        case 3:
                            // Lógica para generar reporte de caducidad
                            break;
                        case 4:
                            // Lógica para generar reporte de resumen de compras
                            break;
                        case 5:
                            // Volver al menú principal
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida");
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }  
}
