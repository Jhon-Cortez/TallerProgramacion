/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author LENOVO
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte cont = 0;
        byte i = 1;
        
        do{
            if (i%2==0) {
                cont++;
            }
            i++;
        }while(i<=50);
        System.out.println(cont);
    }
    
}
