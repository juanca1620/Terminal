/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.Serializable;
import java.util.NoSuchElementException;
import util.Nodo;

/**
 *
 * @author USUARIO
 */
public class Queue <T> implements IQueue<T>,Serializable{

    Nodo primero;
    
    @Override
    public void enQueue(T dato) {
        Nodo nuevo = new Nodo(dato);
        if(isEmpety()){
            this.primero = nuevo;
        }else{
            Nodo aux = primero;
            while(aux.nodoSiguiente != null){
                aux = aux.nodoSiguiente;
            }
            aux.nodoSiguiente = nuevo;
        }
    }

    @Override
    public T deQueue() {
        
        Nodo aux = primero;
        if(isEmpety()){
            
            throw new NoSuchElementException();
        }    
        
            primero = primero.nodoSiguiente;
            return (T) aux.dato;
    }

    @Override
    public T peek() {
        if(isEmpety()){
            throw new NoSuchElementException();
        }
        return (T) primero.dato;
    }

    @Override
    public boolean isEmpety() {
       return primero == null;
    }
    
}
