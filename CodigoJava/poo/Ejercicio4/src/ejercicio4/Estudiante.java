/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Jhon
 */
public class Estudiante {
    private double[] notas;
    private String nombre;
    
    public Estudiante(double[] notas, String nombre){
        this.notas = notas;
        this.nombre = nombre;
    }
    public void calcularPromedio() {
        double sum = 0;

        for (int i = 0; i < notas.length; i++) {
            sum += notas[i];
        }

        double promedio = sum / notas.length;
        System.out.println("El promedio de " + nombre + " es: " + promedio);

        if (promedio >= 3) {
            System.out.println("Aprobo");
        } else {
            System.out.println("No aprobo");
        }
    }
}
