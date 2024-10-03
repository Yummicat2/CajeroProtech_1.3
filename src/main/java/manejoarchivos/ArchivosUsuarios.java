/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoarchivos;

import manejoarchivos.*;

/**
 *
 * @author HP
 */
public class ArchivosUsuarios {
    private String Nombre;
    private String Username;
    private String Password;
    private String Saldo;
    private String Moneda;
    
    public ArchivosUsuarios(String Nombre, String Username, String Password, String Saldo, String Moneda){
        this.Nombre = Nombre;
        this.Username = Username;
        this.Password = Password;
        this.Saldo = Saldo;
        this.Moneda = Moneda;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getUsername(){
        return Username;
    }
    
    public void setUsername(String Username){
        this.Username = Username;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public String getSaldo(){
        return Saldo;
    }
    
    public void setSaldo(String Saldo){
        this.Saldo = Saldo;
    }
    
    public String getMoneda(){
        return Moneda;
    }
    
    public void setMoneda(String Moneda){
        this.Moneda = Moneda;
    }
}
