/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import exceptions.FechaNoValidaException;
import java.time.LocalDateTime;

/**
 *
 * @author USUARIO
 */
public class Persona extends Usuario{
    
    private String nombre;
    private String cedula;
    private LocalDateTime fecha_nacimiento;

    public Persona(String nombre, String cedula, LocalDateTime fecha_nacimiento, String userName, String contrasenna, String rol) {
        super(userName, contrasenna, rol);
        if(fecha_nacimiento.isAfter(LocalDateTime.now())){
            throw new FechaNoValidaException("nacimiento");
        }
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDateTime getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDateTime fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    
}
