/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepolimorfismoss;

import java.util.ArrayList;

/**
 *
 * @author finfanterodal
 */
public class Metodos {
    //Amosar características de todas las personas
    public static void amosar(ArrayList<Persoa> lista){
        //
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));     
        }
        
        /*
        for (Persoa persoa : lista) {
            System.out.println(persoa.toString());
        }
*/
    }
}
