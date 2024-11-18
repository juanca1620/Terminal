/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import modelo.AdminTerminal;
import modelo.Caseta;
import modelo.Usuario;
import util.IList;
import util.Lista;

/**
 *
 * @author USUARIO
 */
public class Singleton {
    
    private static final Singleton INSTANCE = new Singleton();
    private static final String CASETASDATA = "casetas.dat";
    private static final String USERSDATA = "usuarios.dat";
    
    private Caseta[][] casetas;
    private IList<Usuario> usuarios;
    
    private Singleton(){
        casetas = leerCasetas();
        usuarios = leerUsuarios();
    }
    
    private Caseta[][] leerCasetas(){
        try (FileInputStream archivo = new FileInputStream(CASETASDATA);
             ObjectInputStream lector = new ObjectInputStream(archivo)){
            return (Caseta[][])lector.readObject();
        } catch (Exception e) {
            Caseta[][] casetas = new Caseta[4][];
            for (int i = 0; i < casetas.length; i++) {
                casetas[i] = new Caseta[i >= 1?2:5];
                for (int j = 0; j < casetas[i].length; j++) {
                    casetas[i][j] = new Caseta();
                }
            }
            return casetas;
        }
    }
    
    public void escribirCasetas(){
        try (FileOutputStream archivo = new FileOutputStream(CASETASDATA);
             ObjectOutputStream escritor = new ObjectOutputStream(archivo)){
            escritor.writeObject(casetas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private IList<Usuario> leerUsuarios(){
        try (FileInputStream archivo = new FileInputStream(USERSDATA);
             ObjectInputStream lector = new ObjectInputStream(archivo)){
            return (Lista<Usuario>)lector.readObject();
        } catch (Exception e) {
            IList<Usuario> usuarios = new Lista<>();
            usuarios.add(AdminTerminal.ADMIN_Terminal);
            return usuarios;
        }
    }
    
    public void escribirUsuarios(){
        try (FileOutputStream archivo = new FileOutputStream(USERSDATA);
             ObjectOutputStream escritor = new ObjectOutputStream(archivo)){
            escritor.writeObject(usuarios);
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
