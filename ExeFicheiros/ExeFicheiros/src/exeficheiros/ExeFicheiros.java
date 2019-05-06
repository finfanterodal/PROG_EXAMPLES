/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeficheiros;

import escritura.EscribirFicheiro;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import lectura.LerFicheiro;

/**
 *
 * @author finfanterodal
 */
public class ExeFicheiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LerFicheiro obx=new LerFicheiro();
        
        ArrayList<Integer>numList=new ArrayList<>();
        
        // Obxecto de tipo File
        File f=new File("alumnos.txt");
        //obx.lerPalabras(f);
        //Leer lineas
       /* System.out.println("\nLeer Lineas");
        try{
        obx.lerLineas(f);
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());      
        }
        alumnList=obx.lerObxectos(f);
        for (Alumno alumnoL : alumnList) {
            System.out.println(alumnoL);
        }
          /*
        //Leer lineas con delimitador
        System.out.println("\nDelimitador");
        obx.lerPalabrasDelimitadores(f);

        numList= obx.arrayFicheros(f, numList);
        System.out.println(numList);
        PedirDatos.amosarInteger(numList);//For each del ArrayList
         */
        

        //ESCRIBIR FICHEIROS
        EscribirFicheiro obx1 = new EscribirFicheiro();
        ArrayList<Alumno> alumnList = new ArrayList<>();
        
        
       /* for (int i = 0; i < 4; i++) {
            Alumno a=new Alumno(PedirDatos.StringVal("nome"), PedirDatos.intVal("nota"));
            alumnList.add(a);
        }*/
 //     obx1.escribirObjects("Alumnos", alumnList);
        obx1.engadir("Alumnos");
    }

}
