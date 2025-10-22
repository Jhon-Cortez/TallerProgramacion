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
        Scanner entrada = new Scanner(System.in);
        double pago;
        double total;
        
        System.out.println("Digite el precio a ver si aplica para el descuento");
        pago = entrada.nextDouble();
        
        if (pago >=100000) {
            total = pago-(pago * 0.1);
        }else{
            total = pago;
        }
        
        System.out.println("El total a pagar es: "+total);
    }
    
}
