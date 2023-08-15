/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author daniel_alberto.paz
 */
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
