/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

import Utilities.PedirDatos;
import exeficheiros.Alumno;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author finfanterodal
 */
public class EscribirFicheiro {

    File fich = null;
    PrintWriter p = null;

    public File escribirNumeros(String nomeFicheiro) {

        fich = new File(nomeFicheiro + ".txt");
        try {
            //Abrimo fluxo de datos
            p = new PrintWriter(fich);
            //Escribimos
            p.println(PedirDatos.intVal("numero"));
            p.println(PedirDatos.intVal("numero"));
            p.println(PedirDatos.intVal("numero"));
            p.println(PedirDatos.intVal("numero"));

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            p.close();
        }

        return fich;
    }

    public void escribirObjects(String nomeFicheiro, ArrayList<Alumno> alumnList) {

        try {
            p = new PrintWriter(new File(nomeFicheiro + ".txt"));
            for (Alumno lista : alumnList) {
                p.println(lista.getNome() + "," + lista.getNota());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("erro" + ex.getMessage());
        } finally {
            p.close();
        }

    }

    public void engadir(String nomeFicheiro) {

        try {
            //FileWriter me permite engadir elementos sin reescribir.
            p = new PrintWriter(new FileWriter(nomeFicheiro + ".txt", true));
            Alumno a = new Alumno(PedirDatos.StringVal("nome"), PedirDatos.intVal("nota"));
            p.println(a);
        } catch (IOException ex) {
            System.out.println("error" + ex.getMessage());
        }finally{
            p.close();
        }
    }
}
