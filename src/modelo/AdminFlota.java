/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import exceptions.FechaNacimientoNoValidaException;
import java.time.LocalDateTime;

/**
 *
 * @author USUARIO
 */
public class AdminFlota extends Persona{
    
    public AdminFlota(String nombre, String cedula, LocalDateTime fecha_nacimiento, String userName, String contrasenna, String rol) {
        super(nombre, cedula, fecha_nacimiento, userName, contrasenna, rol);
    }
    
}
