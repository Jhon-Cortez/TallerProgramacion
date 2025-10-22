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
        byte edad;
        System.out.println("Escribe tu edad");
        
        edad = entrada.nextByte();
        
        if (edad >=18) {
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        
    }
    
}
