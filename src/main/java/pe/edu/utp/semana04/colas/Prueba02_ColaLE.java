/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.semana04.colas;

/**
 *
 * @author auceda
 */
public class Prueba02_ColaLE {
    public static void main(String[] args){
        ColaLE q = new ColaLE();
        
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("El elemento frontal es: "+q.peek());
        q.dequeue();
        System.out.println("El elemento frontal es: "+q.peek());
    }
    
}
