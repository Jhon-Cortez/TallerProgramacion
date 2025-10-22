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
        System.out.println("Cuantas notas tienes que calcular?");
        float nota = 0;
        float notafinal = 0;
        int i=1;
        byte cantidad = entrada.nextByte();
        while(i <= cantidad){
            notafinal = nota + notafinal;
            i++;
        }
        float prom = notafinal/cantidad;
        System.out.println("El promedio es: "+prom );
    }
    
}
