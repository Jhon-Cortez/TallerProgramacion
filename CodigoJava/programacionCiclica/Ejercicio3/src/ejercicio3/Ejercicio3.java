/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el numero del cual tendras una tablade multiplicar");
        int num = entrada.nextInt();
        int mult = 0;
        
        for (int i = 1; i <= 10; i++) {
            mult = i*num;
            System.out.println(num+"*"+i+"="+mult);
        }
    }
    
}
