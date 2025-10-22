/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Jhon
 */
import java.util.Scanner;
public class CuentaBancaria {
    private String titular;
    private double saldo;
    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void depositar(double deposito){
        saldo=saldo+deposito;
        System.out.println("Se deposito: "+deposito);
    }
    public void retirar(double retiro){
        if (retiro > saldo) {
            System.out.println("No tiene plata pobre");
        }else{
         saldo=saldo-retiro;
         System.out.println("Se retiro: "+retiro);   
        }
    }
    public void mostrarSaldo(){
        System.out.println("El titular: "+titular);
        System.out.println("Saldo: "+saldo);
    }
}
