/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author USUARIO
 */
public class FechaNacimientoNoValidaException extends RuntimeException{
    public FechaNacimientoNoValidaException(){
        super("Fecha de nacimiento no valida");
    }
}
