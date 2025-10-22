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
        //determinar el mayor de 3 numeros
        
        //a pesar de que el ejercicio no dice capturar me vere en la obligacion de colocar un scanner para que le usuario pueda
        //colocar los numeros de los que quiera saber cual es el mayor
        Scanner entrada = new Scanner(System.in);
        
        int n1;
        int n2;
        int n3;
        
        System.out.println("Digite el primer numero");
        n1 = entrada.nextInt();
        
        System.out.println("Digite el segundo numero");
        n2 = entrada.nextInt();
        
        System.out.println("Digite el tercero numero");
        n3 = entrada.nextInt();
        
        if (n1==n2 && n1==n3 && n2==1 && n2==n3) {
            System.out.println("Todos los numeros son iguales");
        }else if (n1 > n2 && n1>n3) {
            System.out.println("El primer numero que digito es el mayor");
        }else if(n2>n1 && n2>n3){
            System.out.println("El segundo numero que digito es el mayor");
        }else {
            System.out.println("El tercer numero que digito es el mayor");
        }
        
    }
    
}
