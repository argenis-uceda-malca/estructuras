/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.utp.semana04.colas;

/**
 *
 * @author DAVID VERA
 */
public class Prueba01_Cola {
    public static void main(String[] args){
        //Intancia una cola de capacidad 5
        Cola colaA = new Cola(5);
        
        colaA.enqueue(1);
        colaA.enqueue(2);
        colaA.enqueue(3);
        
        //Extraer el elemento del frente
        System.out.println("El elemento frontal es: "+ colaA.peek());                
        colaA.dequeue();
        System.out.println("El elemento frontal es: "+ colaA.peek());                
    }
}
