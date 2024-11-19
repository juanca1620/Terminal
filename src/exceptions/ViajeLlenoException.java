/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author USUARIO
 */
public class ViajeLlenoException extends Exception{
    
    public ViajeLlenoException(){
        super("Este viaje tiene todos sus cupos llenos");
    }
}
