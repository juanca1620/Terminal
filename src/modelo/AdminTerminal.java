/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author USUARIO
 */
public class AdminTerminal extends Persona{
    
    public static final AdminTerminal ADMIN_Terminal = new AdminTerminal("admin","99999999999999",LocalDateTime.of(2000, 1, 1, 0, 0, 0),"admin","123",Usuario.ADMIN_TERMINAL);

    public AdminTerminal(String nombre, String cedula, LocalDateTime fecha_nacimiento, String userName, String contrasenna, String rol) {
        super(nombre, cedula, fecha_nacimiento, userName, contrasenna, rol);
    }
    
}
