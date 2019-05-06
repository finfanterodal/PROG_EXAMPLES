/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeficheiros_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 *
 * @author finfanterodal
 */
public class LecturaSerializable {
    ObjectInputStream leer;
    FileInputStream p;
    
  /*  public void leerSer(String nomeFicheiro){
        try {
            p=new FileInputStream(nomeFicheiro+".dat");
            leer=new ObjectInputStream(p);
            Alumno a1=(Alumno)leer.readObject();
            while(a1!=null){
                System.out.println(a1);
                a1=(Alumno)leer.readObject();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error"+ ex.getMessage());
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println("error"+ ex.getMessage());
             
            } catch (Exception ex) {
              System.out.println("error"+ ex.getMessage());
            }
        }*/
    public void leerSer(String nomeFicheiro) {
        try {
            FileInputStream ficheroEntrada = new FileInputStream(nomeFicheiro+".dat");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            Persona p1=(Persona)objetoEntrada.readObject();
              while(p1!=null){
                System.out.println(p1);
                p1=(Persona)objetoEntrada.readObject();
            }
            /*
// se leen dos objetos de la clase Persona
            Persona p1 = (Persona) objetoEntrada.readObject();
            Persona p2 = (Persona) objetoEntrada.readObject();
             Persona p3 = (Persona) objetoEntrada.readObject();
// se cierra el flujo de objetos objetoEntrada
            objetoEntrada.close();
            System.out.println("DNI\t Nombre");
            System.out.println(p1.getAtributos());
            System.out.println(p2.getAtributos());
               System.out.println(p3.getAtributos());
*/
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
