/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package util;

/**
 *
 * @author juanc
 */
public interface IQueue <T>{
    
    public void enQueue (T dato);
    
    public T deQueue();
    
    public T peek ();
    
    public boolean isEmpety();
}
