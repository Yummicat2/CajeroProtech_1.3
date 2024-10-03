/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoarchivos;

import manejoarchivos.ArchivosUsuarios;
import manejoarchivos.Archivo;
import manejoarchivos.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class BDUsuarios {
    public LinkedList<ArchivosUsuarios> obtener(){
        LinkedList<ArchivosUsuarios> usuarios = null;
        Archivo archivo = new Archivo("Usuario.txt");
        LinkedList<String> lineas = archivo.obtenerTextoDeArchivo();
        if(lineas != null){
            usuarios = new LinkedList();
            for(int i=0; i<lineas.size(); i++){
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea, ";"); 
                String Nombre = tokens.nextToken();
                String Username = tokens.nextToken();
                String Password = tokens.nextToken();
                String Saldo = tokens.nextToken();
                String Moneda = tokens.nextToken();
                usuarios.add(new ArchivosUsuarios(Nombre, Username, Password, Saldo, Moneda));
                
            }
        }
        return usuarios;
    }
    
    public boolean registrarUsuario(ArchivosUsuarios u){
        Archivo archivo = new Archivo("Usuario.txt");
        return archivo.registrar(u.getNombre() + ";" 
            + u.getUsername() + ";"
            + u.getPassword() + ";"
            + u.getSaldo() + ";"
            + u.getMoneda());
    }
}
