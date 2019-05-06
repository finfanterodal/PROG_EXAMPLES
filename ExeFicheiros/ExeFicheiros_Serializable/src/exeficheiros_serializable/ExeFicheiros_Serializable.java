/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeficheiros_serializable;

/**
 *
 * @author finfanterodal
 */
public class ExeFicheiros_Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        EscribirSerializable obj=new EscribirSerializable();
        LecturaSerializable obj1=new LecturaSerializable();
        
        //
        obj.escribirObjectsSer("AlumnoSerializable");
        obj1.leerSer("AlumnoSerializable");
        obj.engadirElemento("AlumnoSerializable");
        obj1.leerSer("AlumnoSerializable");
    }
    
}
