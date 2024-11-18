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
public class AdminTerminalController {
    
    private Caseta[][] casetas;
    
    public AdminTerminalController(){
        this.casetas = Singleton.getINSTANCE().getCasetas();
    }
    
    public Caseta getCaseta (int fila,int columna){
        return casetas[fila][columna];
    }
}
