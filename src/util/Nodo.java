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
public class Nodo <T> implements Serializable{
    
    T dato;
    Nodo<T> nodoSiguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.nodoSiguiente = null;
    }
    
    
}
