/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeherdanza;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import java.text.ParseException;
/**
 *
 * @author finfanterodal
 */
public class ExeHerdanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ParseException {
        Empregado empregado1 = new Empregado("Francisco", "2010-02-03", "2134-04-04", "Técnico");
        Secretaria secretaria1 = new Secretaria();
        System.out.println(empregado1.toString());
        empregado1.calcularSoldo("FF");
        secretaria1.calcularSoldo("dd");
        secretaria1.getNome();
        secretaria1.nome="fsd";
        System.out.println(secretaria1.calcularSoldo("dd"));
        
    }

}
