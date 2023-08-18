package modelo;

import java.util.LinkedList;

public class Pila <T extends Base> {
    private LinkedList<T> cima;
    
    public Pila(){
    cima = new LinkedList<>();
    }
    
    public void apilar (T elemento){
    
    cima.addFirst(elemento);
    }
    
    public T desapilar() {
    return cima.removeFirst();
    
    }
    
    public boolean estaVacia(){
    return cima.isEmpty();
    
    }
    
    public String toString(){
    StringBuilder sb = new StringBuilder("{");
    for(T elemento: cima){
    
    sb.append("").append(elemento.toString());
    }
    sb.append("");
    return sb.toString();
    }
    
}
