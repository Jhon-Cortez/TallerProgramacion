/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Jhon
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
                // Inicializar mayor y menor con el primer elemento
        int mayor = numeros[0];
        int menor = numeros[0];

        // Buscar el mayor y el menor
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar resultados
        System.out.println("\nEl número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
