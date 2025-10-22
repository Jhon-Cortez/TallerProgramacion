/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma;
        int resta;
        int mult;
        int div;
        System.out.println("Escribe el primer numero");
        int numero1 = entrada.nextInt();
        System.out.println("Escribe el segundo numero");
        int numero2 = entrada.nextInt();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        
        System.out.println("la suma es:"+suma);
        System.out.println("La resta es:"+resta);
        System.out.println("La multiplicacion es:"+mult);
        System.out.println("La division es:"+div);
    }
    
}
