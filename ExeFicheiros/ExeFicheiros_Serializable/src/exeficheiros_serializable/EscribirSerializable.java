/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeficheiros_serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



/**
 *
 * @author finfanterodal
 */
public class EscribirSerializable {

    ObjectOutputStream fich;
    FileOutputStream p;

 /*   public void escribirObjectsSer(String nomeFicheiro) {
        try {
            p = new FileOutputStream(nomeFicheiro + ".dat");//Puede recibir un String o un tipo File como: new File(nome);
            fich = new ObjectOutputStream(p);
            //Todo en una sentencia: fich=new ObjectOutputStream(new FileOutputStream(nomeFicheiro+".dat"));

            //Pedimos los datos creando objetos de tipo alumno:
            fich.writeObjecty(new Alumno("pepe", 2));
            fich.writeObject(new Alumno("pepe", 2));
            fich.writeObject(new Alumno("pepe", 2));
            fich.writeObject(new Alumno("pepe", 2));

        } catch (FileNotFoundException ex) {
            System.out.println("error" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("error" + ex.getMessage());
         } catch (Exception ex) {
                System.out.println("Error: "+ ex.getMessage());
            }
        }*/
        
    
     public void escribirObjectsSer(String nomeFicheiro) {

        try {
            FileOutputStream ficheroSalida = new FileOutputStream(nomeFicheiro + ".dat");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
// se escriben dos objetos de la clase Persona
            objetoSalida.writeObject(new Persona("55287188B",
                    "María", "Ruiz Ramos"));
            objetoSalida.writeObject(new Persona("40302010A",
                    "Juan", "González López"));
               objetoSalida.writeObject(new Persona("40302010A",
                    "Juan", "González López"));
            objetoSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
    }
     
     public void engadirElemento(String nomeFicheiro){
                 try {
            FileOutputStream ficheroSalida = new FileOutputStream(nomeFicheiro + ".dat",true);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
// se escriben dos objetos de la clase Persona
            objetoSalida.writeObject(new Persona("55287188B",
                    "María", "Ruiz Ramos"));
            
            objetoSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
         
         
         
         
         
     }
}
    
    

