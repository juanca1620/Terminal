/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.Serializable;



/**
 *
 * @author juanc
 */
public class Lista<T> implements IList<T>,Serializable{

    Nodo primero;
    int size;

    public Lista() {
        this.size = 0;
        this.primero = null;
    }
    
    
    @Override
    public void add(T dato) {
        Nodo nuevo = new Nodo(dato);
        if(isEmpty()){
            this.primero = nuevo;
        }else{
            Nodo aux = primero;
            while(aux.nodoSiguiente != null){
                aux = aux.nodoSiguiente;
            }
            aux.nodoSiguiente = nuevo;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0  || index >= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }else{
            if (index == 0){
                return (T) primero.dato;
            }
            Nodo aux = primero;
            for (int i = 1;i <= index;i++){
                aux = aux.nodoSiguiente;
            }
            return (T) aux.dato;
        }
    }

    @Override
    public void add(T dato, int index) {
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }else if (index == 0){

                Nodo nuevo = new Nodo(dato);
                Nodo aux = primero;
                primero = nuevo;
                nuevo.nodoSiguiente = aux;
        }else{
            
            Nodo aux = primero;
            Nodo nuevo = new Nodo(dato);
            
            for (int i = 0; i < index; i++) {
                if (i == index-1){
                    Nodo tem = aux;
                    nuevo.nodoSiguiente = aux.nodoSiguiente;
                    aux.nodoSiguiente = nuevo;
                }
                aux = aux.nodoSiguiente;
            } 
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException(index);
        }else{
            if (index == 0){
                this.primero = primero.nodoSiguiente;
            }else if (index == size - 1){
                               
                Nodo aux = primero;
                for (int i = 0;i < index;i++){
                    aux = aux.nodoSiguiente;
                }
                aux.nodoSiguiente = null;
      
            }else{
                
                Nodo aux = primero;
                Nodo anterior = null;
                
                for (int i = 1;i < index;i++){
                    
                    Nodo tem = aux;
                    aux = aux.nodoSiguiente;
                    anterior = tem;
                    
                }
                
                anterior.nodoSiguiente = aux.nodoSiguiente;
               
            }
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return primero == null;
    }

    @Override
    public void removeAll() {
        primero = null;
        size = 0;
    }

    @Override
    public boolean remove(T dato) {
        
        Nodo aux = this.primero;
        for (int i = 0;i < size; i++){
            if(aux.dato.equals(dato)){
                
                if(i == 0){
                    
                    this.primero = primero.nodoSiguiente;
                    size--;
                    return true;
                    
                }else if(i == size-1){
                    
                    aux.nodoSiguiente = null;
                    size--;
                    return true;
                    
                }else{
                    
                    Nodo anterior = null;
                    aux = primero;
                 
                
                    while (!aux.dato.equals(dato)) { 
                        
                        Nodo tem = aux;
                        aux = aux.nodoSiguiente;
                        anterior = tem;
                    }
          
                    anterior.nodoSiguiente = aux.nodoSiguiente;
                    size--;
                    return true;
                
                }
            }
            aux = aux.nodoSiguiente;
        }
        return false;
    }
    
}
