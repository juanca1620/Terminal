/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import exceptions.CredencialesInvalidasException;
import exceptions.NoEncontradoException;
import modelo.AdminFlota;
import modelo.Caseta;
import modelo.Empresa;
import singleton.Singleton;
import modelo.Usuario;
import util.IList;
import util.Lista;

/**
 *
 * @author USUARIO
 */
public class LoginController {

    private IList<Usuario> usuarios;
    
    public LoginController(){
        this.usuarios = getAllUsers();
    }

    private IList<Usuario> getAllUsers() {
        return ControladorUsers.getAllUsers();
    }
    
    public void validarCredenciales(Usuario usuario,String contrasenna) throws CredencialesInvalidasException{
        if(!usuario.login(contrasenna)){
            throw new CredencialesInvalidasException();
        }
    }
    
    public Usuario buscarUsuarioPorUserName (String username) throws NoEncontradoException{
        Usuario usuario = ControladorUsers.buscarUsuarioPorUserName(username);
        if(usuario ==  null){
            throw new NoEncontradoException("Usuario");
        }
        return usuario;
    }
    
    public Caseta buscarCasetaPorAdmin(AdminFlota admin) {
        Caseta[][] casetas = Singleton.getINSTANCE().getCasetas();


        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Caseta caseta = casetas[i][j];

                if (caseta.getEstado().equals(Caseta.OCUPADO)) {
                    Empresa empresa = caseta.getEmpresa();

                    if (empresa.getAdmin() != null && empresa.getAdmin().equals(admin)) {
                        return caseta;
                    }
                }
            }
        }
        return null;
    }
    
}
