/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Usuario implements Serializable{
    
    public static final String ADMIN_TERMINAL = "admin_terminal";
    public static final String ADMIN_FLOTA = "admin_flota";
    public static final String CLIENTE = "cliente";
    
    private String userName;
    private String contrasenna;
    private String rol;

    public Usuario(String userName, String contrasenna, String rol) {
        this.userName = userName;
        this.contrasenna = contrasenna;
        this.rol = rol;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public boolean login(String contrasenna){
        return this.contrasenna.equals(contrasenna);
    }

    public String getContrasenna() {
        return contrasenna;
    }
    
    
}
