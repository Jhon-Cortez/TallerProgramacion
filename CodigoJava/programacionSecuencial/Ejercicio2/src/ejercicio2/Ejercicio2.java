/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double area;
        double perimetro;
        double radio;
        
        System.out.println("Digite el radio de un circulo");
        radio = entrada.nextDouble();
        area = 3.14 * (radio*radio);
        perimetro =2*3.14*radio;
        
        System.out.println("El area del circulo es: "+area);
        System.out.println("El perimetro del circulo es: "+perimetro);
        
    }
    
}
