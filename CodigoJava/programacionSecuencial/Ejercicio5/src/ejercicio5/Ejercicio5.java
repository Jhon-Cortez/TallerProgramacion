/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1;
        float n2;
        float n3;
        float prom;
        
        System.out.println("Digite la nota 1:");
        n1 = entrada.nextFloat();
        System.out.println("Digite la nota 2:");
        n2 = entrada.nextFloat();
        System.out.println("Digite la nota 3:");
        n3 = entrada.nextFloat();
        
        prom = (n1 + n2 + n3)/3;
        
        System.out.println("El promedio de las 3 notas es: "+prom);
        
        
    }
    
}
