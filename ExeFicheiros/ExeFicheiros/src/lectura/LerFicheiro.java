/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura;

import exeficheiros.Alumno;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author finfanterodal
 */
public class LerFicheiro {
    //

    Scanner sc;

    public void lerPalabras(File fich) {
        try {
            sc = new Scanner(fich);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }finally{
        sc.close();
        }
    }

    public void lerLineas(File fich) throws FileNotFoundException {

            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();   
    }
    
     public void lerPalabrasDelimitadores(File fich) {
        try {
            sc = new Scanner(fich).useDelimiter(",\\s*");//utilizamos como delimitador la coma y a continuación puede haber retorno de carro, espacio... y también podemos poner "\\s*,\\s*" en este caso puede haber espacios antes y después de la coma.
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }finally{
        sc.close();
        }
    }

    //A escritura y escritura es costosa, por eso trabajamos con ficheros y arraylist:leemos del fichero los números y los metemos en un arraylis
    public ArrayList<Integer> arrayFicheros(File fich, ArrayList<Integer> numList) {
        try {
            sc = new Scanner(fich).useDelimiter(",");//utilizamos como delimitador la coma y a continuación puede haber retorno de carro, espacio... y también podemos poner "\\s*,\\s*" en este caso puede haber espacios antes y después de la coma.
            while (sc.hasNext()) {
                numList.add(sc.nextInt());
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            sc.close();
        }
        return numList;
    }
    
    public ArrayList<Alumno> lerObxectos(File fich) {
        ArrayList<Alumno> alumnList = new ArrayList<>();
        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                String[] alumnos = sc.nextLine().split(" ");
                System.out.println(alumnos[0] + "  " + alumnos[1]);
                Alumno a1 = new Alumno(alumnos[0], Integer.parseInt(alumnos[1]));
                alumnList.add(a1);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return alumnList;
    }
    
}
