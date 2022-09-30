/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.semana04.pilas;

/**
 *
 * @author auceda
 */
public class Pila {
    private int arr[];
    private int indEncima;
    private int capacidad;
    
    //Contructor
    Pila(int tamanio){
        arr = new int[tamanio];
        capacidad = tamanio;
        indEncima = -1;
    }
    //Metodo para agregar un elemento en la pila
    public void push(int valor){
        //validar si la pila esta llena
        if(estaLlena()){
            System.err.println("overflow\nProgramaterminado");
            System.exit(-1);
        }
        System.out.println("Insertando: "+valor);
        arr[++indEncima]=valor;
    }
    //Metodo para desapilar o sacar unelemento de una pila
    public int pop(){
        //validar si hay desbordamiento del stack
        if(estaVacia()){
            System.out.println("UnderFlow\nPRograma Terminado");
            System.exit(-1);
        }
        System.out.println("Removiendo: "+ peek());
        return arr[indEncima--];
    }
    //Metodo para dar un vistazo al elemento de encima (top)
    public int peek(){
        if (!estaVacia()){
            return arr[indEncima];
        }else{
            System.exit(-1);
        }
        return -1;
    }
    
        //Metodo utilitario para devolver el tamaño de la cola
    public int tamanio(){
        return indEncima+1;
    }
    
    //Metodo utilitario para verificar si la cola está vacía
    public boolean estaVacia(){
        return indEncima ==-1;
    }
    
    //Metodo utilitario para verificar si la cola está llena
    public boolean estaLlena(){
        return (indEncima==capacidad-1);
    }
    
}
