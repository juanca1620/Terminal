/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import exceptions.NoEncontradoException;
import modelo.Caseta;
import modelo.Empresa;
import modelo.Persona;
import modelo.Usuario;
import singleton.Singleton;
import util.IList;
import util.Lista;

/**
 *
 * @author USUARIO
 */
public class ControladorUsers {
    
    
    public static IList<Usuario> getAllUsers() {

        IList<Usuario> aux = new Lista<>();
        IList<Usuario> usuarios = Singleton.getINSTANCE().getUsuarios();
        Caseta[][] casetas = Singleton.getINSTANCE().getCasetas();

        for (int i = 0; i < usuarios.size(); i++) {
            aux.add(usuarios.get(i));
        }


        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Caseta caseta = casetas[i][j];

                if (caseta != null && caseta.getEmpresa() != null) {
                    Empresa empresa = caseta.getEmpresa();
                    
                    if (empresa.getAdmin() != null) {
                        aux.add(empresa.getAdmin());
                    }
                }
            }
        }
        return aux;
    }
    
    public static Usuario buscarUsuarioPorUserName (String username) {
        IList<Usuario> usuarios = getAllUsers();
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            if(usuario.getUserName().equals(username)){
                return usuario;
            }
        }
        return null;
    }
    
    public static Usuario buscarUsuarioPorCedula (String cedula) {
        IList<Usuario> usuarios = getAllUsers();
        for (int i = 0; i < usuarios.size(); i++) {
            Persona persona = (Persona)usuarios.get(i);
            if(persona.getCedula().equals(cedula)){
                return persona;
            }
        }
        return null;
    }
}
