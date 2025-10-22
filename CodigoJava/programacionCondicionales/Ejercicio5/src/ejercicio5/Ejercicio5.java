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
        float notaf;
        
        System.out.println("Digite su nota final de 1 a 5");
        notaf = entrada.nextFloat();
        if (notaf<3) {
            System.out.println("Su nota es:" +notaf+" --Insuficiente");
        }else if(notaf>=3 && notaf <4){
            System.out.println("Su nota es:" +notaf+" --Bueno");
        }else if(notaf>=4 && notaf <=5){
            System.out.println("Su nota es:" +notaf+" --Excelente");
        }
        
    }
    
}
