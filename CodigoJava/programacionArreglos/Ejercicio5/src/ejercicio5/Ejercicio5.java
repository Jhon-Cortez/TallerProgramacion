/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Jhon
 */
import java.util.Scanner;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte aprobadas = 0;
        byte noAprobadas = 0;
        Scanner entrada = new Scanner(System.in);
        byte nNotas = 0;
        System.out.println("Escribe la cantidad de notas que quieres evaluar");
        nNotas = entrada.nextByte();
        int[] notas = new int[nNotas];

        for (int i = 0; i < nNotas; i++) {
            System.out.print("Escribe la nota " + (i + 1) + ": ");
            notas[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < nNotas; i++) {
            if (notas[i]>=3) {
                aprobadas++;
            }else{
                noAprobadas++;
            }
        }
        System.out.println("La notas aprobadas son: "+aprobadas);
        System.out.println("La notas no aprobadas son: "+noAprobadas);
    }
    
}
