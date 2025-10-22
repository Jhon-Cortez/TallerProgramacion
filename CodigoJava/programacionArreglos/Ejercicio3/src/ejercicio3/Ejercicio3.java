/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Jhon
 */
import java.util.Scanner;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte negativos = 0;
        byte positivos = 0;
        int numeros[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Escribe el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (numeros[i]>0) {
                positivos++;
            }else{
                negativos++;
            }
        }
    }
    
}
