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
public class NotaMedia {
//Atributos
    private double notaTeoria;
    private double notaPracticas;
    private double notaBoletines;
    private double nota_media;
    private String nome;
//Método para pedir y validar la nota Práctica
    public double notasPracticas() {//Pedimos la nota de prácticas
        do {//Validamos
            notaPracticas = Double.parseDouble(JOptionPane.showInputDialog("\nIntroduce la nota de prácticas"));
            if (notaPracticas < 1 || notaPracticas > 10) {
                JOptionPane.showMessageDialog(null, "\nError.");
            }
        } while (notaPracticas < 1 || notaPracticas > 10);
        return notaPracticas;
    }
//Método para pedir y validar la nota teórica
    public double notasTeoricas() {
        //Locales
        double notaT1;
        double notaT2;
        //Pedimos y validamos datos nota teoría 1.
        do {
            notaT1 = Double.parseDouble(JOptionPane.showInputDialog("\nIntroduce la nota de teoría 1"));
            if (notaT1 < 1 || notaT1 > 10) {
                JOptionPane.showMessageDialog(null, "\nError.");
            }
        } while (notaT1 < 1 || notaT1 > 10);
        //Pedimos y validamos datos nota teoría 2.
        do {
            notaT2 = Double.parseDouble(JOptionPane.showInputDialog("\nIntroduce la nota de teoría 2"));
            if (notaT2 < 1 || notaT2 > 10) {
                JOptionPane.showMessageDialog(null, "\nError.");
            }
        } while (notaT2 < 1 || notaT2 > 10);
        notaTeoria = (notaT1 + notaT2) / 2;
        return notaTeoria;//Devolvemos la nota teórica que es la media de las 2 introducidas
    }
//Método para calcular la nota de Boletines en base a los boletines entregados
    public double notasBoletines() {
        int boletinesTotales = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduce de Boletines totales."));
        int boletinesentregados = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduce de Boletines entregados."));
        double porcentaje = (100 * boletinesentregados) / boletinesTotales;
        if (porcentaje < 70) {
            notaBoletines = 0;
        } else if (porcentaje < 90) {
            notaBoletines = 1;
        } else {
            notaBoletines = 2;
        }
        return notaBoletines;
    }
//Método para pedir nombre del alumno
    public String pedirNome() {
        nome = (JOptionPane.showInputDialog("\nIntroduce o nome"));
        return nome;
    }
//Método vacío para calcular la nota media, y la muestra.
    public void notaMedia() {
        do {
            //Llamo a tódos los métodos anteriores para hacer una sola llamada en el main.
            pedirNome();
            notasTeoricas();
            notasBoletines();
            notasPracticas();
            nota_media = Math.round(0.4 * notaTeoria + 0.4 * notaPracticas + notaBoletines);
            JOptionPane.showMessageDialog(null, "\nAlumno: " + nome + "\nNota Media: " + nota_media);
        } while (notaTeoria != 1);
    }
}
