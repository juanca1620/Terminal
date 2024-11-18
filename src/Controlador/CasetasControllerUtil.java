/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import modelo.Caseta;
import singleton.Singleton;

/**
 *
 * @author USUARIO
 */
public class CasetasControllerUtil {
    private static Caseta[][]casetas = Singleton.getINSTANCE().getCasetas();
    
public static Caseta buscarCasetaPorNIT(int nit) {
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Caseta caseta = casetas[i][j];
                if (caseta.getEmpresa() != null && 
                    caseta.getEmpresa().getNIT() == nit) {
                    return caseta;
                }
            }
        }
        return null;
    }
    
    public static Caseta buscarCasetaPorNombre(String nombre) {
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Caseta caseta = casetas[i][j];
                if (caseta.getEmpresa() != null && 
                    caseta.getEmpresa().getNombreEmpresa().equals(nombre)) {
                    return caseta;
                }
            }
        }
        return null;
    }
}
