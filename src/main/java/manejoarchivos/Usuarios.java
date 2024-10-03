/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoarchivos;

import manejoarchivos.BDUsuarios;
import manejoarchivos.ArchivosUsuarios;
import manejoarchivos.*;
import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class Usuarios {
      private LinkedList <ArchivosUsuarios> usuario;
      
      public void agregar(ArchivosUsuarios usuarios){
          usuario.add(usuarios);
      }
      
      public void eliminar(int indice){
          usuario.remove(indice);
      }
      
      public int total(){
          return usuario.size();
      }
      
      public ArchivosUsuarios obtener(int indice){
          return usuario.get(indice);
      }
      
      public void cargarUsuarios(){
          BDUsuarios bd = new BDUsuarios();
          usuario = bd.obtener();
      }
      
      public void imprimir(){
          for(int i=0; i<usuario.size(); i++){
              System.out.println(usuario.get(i).getNombre() + " " + usuario.get(i).getSaldo());
          }
      }
}
