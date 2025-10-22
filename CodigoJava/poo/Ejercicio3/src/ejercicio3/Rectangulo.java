/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Jhon
 */
public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public void calcularArea(){
        double area = base*altura;
        System.out.println("El area es: "+area);
    }
    public void calcularPerimetro(){
        double perimetro = 2*base + 2*altura;
        System.out.println("El perimetro es: "+perimetro);
    }
}
