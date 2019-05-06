/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exebucles;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Bucles {
    //Atributos

    private int nota;
    private String nome;
    //Métodos

    public int pedirNota() {
        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduce la nota."));
            if (nota < 1 || nota > 10) {
                JOptionPane.showMessageDialog(null, "\nError.");
            }

        } while (nota < 1 || nota > 10);
        return nota;
    }

    public String pedirNome() {
        nome = (JOptionPane.showInputDialog("\nIntroduce o nome"));
        return nome;
    }
    //while

    public void bucleWhile() {
        pedirNota();
        while (nota >= 5 && nota <= 10) {
            JOptionPane.showMessageDialog(null, "\nAprobado.");
            pedirNota();
        }
        JOptionPane.showMessageDialog(null, "Saimos de WHILE");
    }

    public void bucleDoWhile() {
        do {
            pedirNota();
            if (nota >= 5 && nota <= 10) {
                JOptionPane.showMessageDialog(null, "\nAprobado.");
            }
        } while (nota >= 5 && nota <= 10);
        JOptionPane.showMessageDialog(null, "Saimos do DO WHILE");
    }

    public void bucleFor() {
        int contador;
        for (contador = 0; contador <= 4; contador++) {
            pedirNome();
            pedirNota();
            if (nota >= 5 && nota <= 10) {
                JOptionPane.showMessageDialog(null, "\nAprobado.");
            }
        }
        JOptionPane.showMessageDialog(null, "Saimos do FOR");
    }            
}
