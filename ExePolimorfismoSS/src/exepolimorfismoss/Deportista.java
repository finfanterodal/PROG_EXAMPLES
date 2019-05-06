/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepolimorfismoss;

/**
 *
 * @author finfanterodal
 */
public class Deportista extends Persoa{
    //
    private String tipo;
    //

    public Deportista() {
    }

    public Deportista(String tipo, String nome, float soldo) {
        super(nome, soldo);
        this.tipo = tipo;
    }
    //

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"\ntipo=" + tipo;
    }
    
    @Override
    public float calcularSoldo(){        
        return super.calcularSoldo()+20000;        
    }
    
}
