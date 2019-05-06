/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeherdanza;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Empregado {

    //Atributos
    public String nome;
    private Date inicioTraballo;
    private Date dataNacemento;
    private String titulacion;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    //Constructores
    public Empregado() {
    }

    public Empregado(String nome, String inicioTraballo, String dataNacemento, String titulacion)throws ParseException {
        
        this.nome = nome;
        this.inicioTraballo = simpleDateFormat.parse(inicioTraballo);
        this.dataNacemento = simpleDateFormat.parse(dataNacemento);
        this.titulacion = titulacion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getInicioTraballo() {
        return inicioTraballo;
    }

    public void setInicioTraballo(Date inicioTraballo) {
        this.inicioTraballo = inicioTraballo;
    }

    public Date getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(Date dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }

    public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
        this.simpleDateFormat = simpleDateFormat;
    }


    //ToString
    @Override
    public String toString() {
        return "Empregado{" + "\nnome=" + nome + "\n inicioTraballo=" + inicioTraballo
                + "\ndataNacemento=" + dataNacemento + "\n titulacion=" + titulacion;
    }

    //Método Calcular Soldo
    public float calcularSoldo(String nome) {
        float soldo = 40f;
        return soldo;
    }
    //
   
}
