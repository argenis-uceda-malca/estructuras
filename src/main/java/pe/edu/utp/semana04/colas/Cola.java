/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.utp.semana04.colas;

/**
 *
 * @author DAVID VERA
 * IMPLEMENTAR UNA COLA DE ENTEROS USANDO ARREGLOS
 */
public class Cola {
    private int[] arr;//array para guardar los elementos de la cola
    private int indPrincipio; //elemeneto frontal en la cola
    private int indFinal; //la parte trasera de la cola
    private int capacidad;// la maxima capaciddad de la cola
    private int contador; //Tamaño actual de la cola
    
    //Constructor en base a la capacidad de la cola
    Cola(int tamanio){
        arr = new int[tamanio];
        capacidad = tamanio;
        indPrincipio = 0;
        indFinal = -1;
        contador = 0;
                
    }
    
    //Metodo para agregar un elemento a la cola
    public void enqueue(int valor){
        if(estaLlena()){
            System.out.println("OverFlow: La cola está desbordada");
            System.exit(-1);
        }
        System.out.println("Insertando: "+ valor);
        
        indFinal = (indFinal + 1)%capacidad;
        arr[indFinal] = valor;
        contador++;
    }
    
    //Metodo para recuperar el elemento frontal de la cola
    public int dequeue(){
        //validar si hay desbordamiento en la cola
        if(estaVacia()){
            System.out.println("Underflow\n Ptograma Terminado");
            System.exit(-1);
        }
        int valPrincipio = arr[indPrincipio];
        System.out.println("Removiendo: "+ valPrincipio);
        indPrincipio = (indPrincipio+1)% capacidad;
        contador--;        
        
        //devolver el valor frontal o del principio
        return valPrincipio;
    }
    
    //Metodo Peek par echar un vistazo del elemento frontal
    public int peek(){
        if(estaVacia()){
            System.out.println("Underflow\n Ptograma Terminado");
            System.exit(-1);
        }
        return arr[indPrincipio];
    }
    
    //Metodo utilitario para devolver el tamaño de la cola
    public int tamanio(){
        return contador;
    }
    
    //Metodo utilitario para verificar si la cola está vacía
    public boolean estaVacia(){
        return (tamanio()==0);
    }
    
    //Metodo utilitario para verificar si la cola está llena
    public boolean estaLlena(){
        return (tamanio()==capacidad);
    }
    
}






