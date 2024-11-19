/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import exceptions.IdentificadorRepetidoException;
import modelo.Caseta;
import modelo.Empresa;
import modelo.Usuario;
import singleton.Singleton;

/**
 *
 * @author USUARIO
 */
public class CasetaController {
    
    private Caseta caseta;

    public CasetaController(Caseta caseta) {
        this.caseta = caseta;
    }
    
    public void guardarEmpresa(Empresa empresa,int slots,double precio,String ciudadOrigen) throws IdentificadorRepetidoException{
        Caseta aux = CasetasControllerUtil.buscarCasetaPorNIT(empresa.getNIT());
        if(aux != null){
            throw new IdentificadorRepetidoException("NIT");
        }
        aux = CasetasControllerUtil.buscarCasetaPorNombre(empresa.getNombreEmpresa());
        if(aux != null){
            throw new IdentificadorRepetidoException("Nombre");
        }
        
        Usuario userAux = ControladorUsers.buscarUsuarioPorCedula(empresa.getAdmin().getCedula());
        
        if(userAux != null){
            throw new IdentificadorRepetidoException("Cedula");
        }
        
        userAux = ControladorUsers.buscarUsuarioPorUserName(empresa.getAdmin().getUserName());
        
        if(userAux != null){
            throw new IdentificadorRepetidoException("Usuario");
        }
        
        this.caseta.addEmpresa(empresa, slots, precio, ciudadOrigen);
        
        Singleton.getINSTANCE().escribirSingleton();
    }
}
