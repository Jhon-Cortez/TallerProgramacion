/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double iva;
        double precio;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el precio de un producto");
        
        precio = entrada.nextDouble();
        
        iva = precio * 0.19;
        
        System.out.println("El iva del producto es: "+iva);
    }
    
}
