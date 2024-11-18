/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import exceptions.IdentificadorRepetidoException;
import modelo.Buz;
import modelo.Caseta;
import modelo.Empresa;
import singleton.Singleton;
import util.IList;

/**
 *
 * @author USUARIO
 */
public class BucesController {
    
    private Caseta caseta;
    private Empresa empresa;

    public BucesController(Caseta caseta) {
        this.caseta = caseta;
        this.empresa = caseta.getEmpresa();
    }
    
    public static Buz buscarBusPorPlaca(String placa){
        Caseta[][] casetas = Singleton.getINSTANCE().getCasetas();
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Caseta caseta = casetas[i][j];
                if(caseta.getEmpresa() != null){
                    IList<Buz> bucesEmpresa = caseta.getEmpresa().getBuces();
                    
                    for (int k = 0; k < bucesEmpresa.size(); k++) {
                        Buz buz = bucesEmpresa.get(k);
                        if(buz.getPlaca().equals(placa)){
                            return buz;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public void agregarBuz(Buz buz) throws IdentificadorRepetidoException{
        Buz aux = buscarBusPorPlaca(buz.getPlaca());
        if(aux != null){
            throw new IdentificadorRepetidoException("Placa");
        }
        empresa.addBuz(buz);
        Singleton.getINSTANCE().escribirCasetas();
    }
}
