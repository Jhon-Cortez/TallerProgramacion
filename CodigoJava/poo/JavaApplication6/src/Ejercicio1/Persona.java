




 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Jhon
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void VerfEdad(){
        if (getEdad() >= 18) {

            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }

}
