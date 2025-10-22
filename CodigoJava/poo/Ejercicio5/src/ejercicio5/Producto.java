/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Jhon
 */

//Clase Producto: atributos (nombre, precio, cantidad); métodos calcularTotal() y aplicarDescuento().
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private double total;
    
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public void calcularTotal(){
        total = precio * cantidad;
        System.out.println("El precio total es: "+total);
    }
    public void aplicarDescuento(){
        if(cantidad >= 5){
            total = total - (total*0.05);
            System.out.println("Se aplica descuento del 5% el precio es: "+total);
        }else{
            System.out.println("No se aplica descuento: "+total);
        }
    }
}
