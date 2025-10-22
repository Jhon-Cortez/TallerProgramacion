/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        
        System.out.println("Digite los grados celcius para cambiar a Fahrenheit");
        
        celsius = entrada.nextDouble();
        
        fahrenheit = (celsius*(9/5))+32;
        
        System.out.println(celsius+"° celcius en fahrenheit son:"+fahrenheit);
        
    }
    
}
