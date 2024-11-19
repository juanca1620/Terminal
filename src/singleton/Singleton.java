/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import modelo.AdminTerminal;
import modelo.Caseta;
import modelo.Usuario;
import util.IList;
import util.Lista;

/**
 *
 * @author USUARIO
 */
public class Singleton implements Serializable{
    
    private static final Singleton INSTANCE = leerSingleton();
    private static final String SINGLETONDATA = "singleton.dat";
    
    private Caseta[][] casetas;
    private IList<Usuario> usuarios;
    
    private Singleton(){
        casetas = inizializarCasetas();
        usuarios = new Lista<>();
        usuarios.add(AdminTerminal.ADMIN_Terminal);
    }
    
    private Caseta[][] inizializarCasetas(){
                    Caseta[][] casetas = new Caseta[4][];
            for (int i = 0; i < casetas.length; i++) {
                casetas[i] = new Caseta[i >= 1?2:5];
                for (int j = 0; j < casetas[i].length; j++) {
                    casetas[i][j] = new Caseta();
                }
            }
            return casetas;
    }
    
    
    private static Singleton leerSingleton(){
        try (FileInputStream archivo = new FileInputStream(SINGLETONDATA);
             ObjectInputStream lector = new ObjectInputStream(archivo)){
             return  (Singleton)lector.readObject();
             
        } catch (Exception e) {
            return new Singleton();
        }
    }

    public void escribirSingleton(){
        try (FileOutputStream archivo = new FileOutputStream(SINGLETONDATA);
             ObjectOutputStream escritor = new ObjectOutputStream(archivo)){
            escritor.writeObject(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Singleton getINSTANCE() {
        return INSTANCE;
    }

    public Caseta[][] getCasetas() {
        return casetas;
    }

    public IList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    
    
}
