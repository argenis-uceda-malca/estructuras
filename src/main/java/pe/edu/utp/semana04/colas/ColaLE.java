/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.semana04.colas;

/**
 *
 * @author auceda
 */
public class ColaLE {
    private static Nodo alFinal = null;
    private static Nodo principio = null;
    private static int contador = 0;
    
    //Metodo utilitario para devolver el tamaño de la cola
    public int tamanio(){
        return contador;
    }
    
    //metodo para sacar de la cola un elemento
    
    public static int dequeue(){
        if(principio == null){
            System.err.println("Cola Underflow");
            System.exit(-1);
        }
        Nodo tempNodo = principio;
        System.out.println("Removiendo: "+ tempNodo.dato);
        
        //avanzamos al siguiente nodo
        principio = principio.next;
        //si la lista esta vacia entonces el final de la cola tambien
        if(principio == null){
            alFinal = null;
        }
        contador--;
        
        //devolvemos el elemento extraido
        return tempNodo.dato;
    }
    
    //metodo para agregar un elemento al final
    public static void enqueue(int valor){
        //asignar un nuevo nodo
        Nodo miNodo = new Nodo(valor);
        System.out.println("Insertando: "+ valor);
        
        //validar si la cola esta vacia
        if(principio == null){
            //inicializar el frente como el final
            principio = miNodo;
            alFinal = miNodo;
        }else{
            alFinal.next = miNodo;
            alFinal = miNodo;
        }
        //aumentamos la cuenta en 1
        contador++;
    }
    
    //Metodo para devolver el eelemento del frente
    public static int peek(){
        if(principio == null){
            System.exit(-1);
        }
        return principio.dato;
    }
    
    //Metodo utilitario para verificar si la cola está vacía
    public boolean estaVacia(){
        return alFinal == null && principio == null;
    }
}
