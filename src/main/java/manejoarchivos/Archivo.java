/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoarchivos;

import manejoarchivos.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Archivo {

    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> obtenerTextoDeArchivo() {
        LinkedList<String> LineasDeTexto = null;
        try {
            File archivo = obtenerArchivo();
            if (archivo.exists()) {
                LineasDeTexto = new LinkedList();
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String Linea;
                while ((Linea = br.readLine()) != null) {
                    System.out.println(Linea);
                    LineasDeTexto.add(Linea);
                }
                br.close();
            } else {
                JOptionPane.showMessageDialog(null, "El archivo de texto no existe");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Se produjo un error");
        }
        return LineasDeTexto;
    }

    private File obtenerArchivo() {
        try {
            URL url = getClass().getClassLoader().getResource("archivos/" + nombre);
            return new File(url.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
        }

    public boolean registrar(String linea) {
        File archivo = obtenerArchivo();
        try {
            if (archivo.exists()) {
                FileWriter fw = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(linea);
                pw.flush();
                pw.close();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}


