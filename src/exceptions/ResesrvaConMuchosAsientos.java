/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author juanc
 */
public class ResesrvaConMuchosAsientos extends Exception{
    
    public ResesrvaConMuchosAsientos(){
        super("Error:Esta reserva supera los cupos maximos de el viaje");
    }
}
