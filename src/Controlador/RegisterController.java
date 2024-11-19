/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import exceptions.IdentificadorRepetidoException;
import modelo.Persona;
import modelo.Usuario;
import singleton.Singleton;

/**
 *
 * @author USUARIO
 */
public class RegisterController {
    
    public void validarUsuario(Usuario usuario) throws IdentificadorRepetidoException{
       
        Persona persona = (Persona)usuario;
        
        Usuario aux = ControladorUsers.buscarUsuarioPorCedula(persona.getCedula());
        if(aux != null){
            throw new IdentificadorRepetidoException("Cedula");
        }
        aux = ControladorUsers.buscarUsuarioPorUserName(persona.getUserName());
        if(aux != null){
            throw new IdentificadorRepetidoException("Nombre de usuario");
        }
    }
    
    public void guardarUsuario(Usuario usuario) throws IdentificadorRepetidoException{
        validarUsuario(usuario);
        Singleton.getINSTANCE().getUsuarios().add(usuario);
        Singleton.getINSTANCE().escribirSingleton();
    }
}
