/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author USUARIO
 */
public class HorariosTrocadosException extends  Exception{
    public HorariosTrocadosException (String objeto,String razon){
        super("Las horas del " + objeto + "Se cruza con " + razon);
    }
}
