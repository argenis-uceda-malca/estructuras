/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.semana04.pilas;

/**
 *
 * @author auceda
 */
public class Prueba01_Pila {
    public static void main(String[]args){
        Pila p = new Pila(3);
        p.push(1);
        p.push(2);
        p.push(3);
        System.out.println("El elemento encima es: "+ p.peek());
        p.pop();
        System.out.println("El elemento encima es: "+ p.peek());
    }
}
