package exexenericos;

import java.util.ArrayList;

/**
 *
 * @author finfanterodal
 * @param <T>
 */
public class ClaseXenerica<T> { //Clase parametrizada

    //
    private T valor; //Variable genérica
    //

    public ClaseXenerica() {
    }
    //

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    //
    public <T> void amosar(ArrayList<T> lista) { //<T> indicamos que es un método genérico, puede estar en una clase genérica como para una normal.
        System.out.println("");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("\nFOREACH");

        for (T t : lista) {
            System.out.println(t);
        }
        System.out.println("");
    }
    
    public void ver(ArrayList<? extends Persoa> lista){//Utilizamos comodín para que me siva para Persoa y su descendencia
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
