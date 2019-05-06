package exexenericos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class ExeXenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 

        //
        ClaseObject obx = new ClaseObject();
        obx.setVariable("Pinguino");
        String cadena = (String) obx.getVariable(); //Nos devuelve un Object así que lo casteamos al tipo que queremos.
        System.out.println(cadena);
        /**
         * ***********
         */
        Persoa humano = new Persoa("Francisco", 2000f);
        obx.setVariable(humano);
        Persoa humano2 = (Persoa) obx.getVariable();//Nos devuelve un Object así que lo casteamos al tipo que queremos.
        System.out.println(humano2.toString());
        /**
         * ***********
         */
        ClaseXenerica<String> gotham = new ClaseXenerica<>(); //Al instanciar le damos el tipo, lo restringimos.
        gotham.setValor("Ed Nygma");
        String cadena2 = gotham.getValor();
        System.out.println(cadena2);
        
        

        ClaseXenerica<Persoa> arkham = new ClaseXenerica<>();
        Persoa humano3 = new Persoa("Bruce Wayne", 1000000f);
        arkham.setValor(humano3);
        Persoa humano4 = arkham.getValor();
        System.out.println(humano4.toString());

          /**
         * ***********
         */
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            lista.add(JOptionPane.showInputDialog("String"));
        }
        ArrayList<Persoa> lista1 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Persoa p = new Persoa(JOptionPane.showInputDialog("Nome"), Float.parseFloat(JOptionPane.showInputDialog("soldo")));
            lista1.add(p);
        }

        gotham.amosar(lista);
        arkham.amosar(lista1);

        /**
         * ***********
         */
        ClaseXenerica<Profesorado> blackgate = new ClaseXenerica<>();
        ArrayList<Profesorado> lista2 = new ArrayList<>();
        lista2.add(new Profesorado("fol", "a1", 1000));
        lista2.add(new Profesorado("foles", "a2", 1000));

        blackgate.ver(lista1);
        blackgate.ver(lista2);
    }

}
