/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeswitchcase;
import java.util.Scanner;
/**
 *
 * @author finfanterodal
 */
public class ExeSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MENU\n1.Lunes"
                + "\n2.Martes"
                + "\n3.Miércoles"
                + "\n4.Jueves"
                + "\n5.Viernes"
                + "\n6.Sábado"
                + "\n7.Domingo"
                + "\nELIXE UNHA OPCION.");
        Scanner sc=new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt){
            case 1:System.out.println("Lunes");
             break;
            case 2:System.out.println("Martes");  
             break;
            case 3:System.out.println("Miércoles");
             break;
            case 4:System.out.println("Jueves");
             break;
            case 5:System.out.println("Viernes");
             break;
            case 6:System.out.println("Sábado");
             break;
            case 7:System.out.println("Domingo");
             break;
            default:System.out.println("Error");
        }
    }
    
}
