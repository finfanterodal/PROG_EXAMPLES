/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeherdanza;

import java.util.Date;
import java.text.ParseException;
/**
 *
 * @author finfanterodal
 */
public class Secretaria extends Empregado {
    //Atribustos
    private String telefonoMobil;
    
    //Constructores

    public Secretaria(String telefonoMobil, String nome, String inicioTraballo, String dataNacemento, String titulacion) throws ParseException{
        super(nome, inicioTraballo, dataNacemento, titulacion);
        this.telefonoMobil = telefonoMobil;
    }

    public Secretaria() {
    }
    

    //GEtters SEtters

    public String getTelefonoMobil() {
        return telefonoMobil;
    }

    public void setTelefonoMobil(String telefonoMobil) {
        this.telefonoMobil = telefonoMobil;
    }
    //ToString

    @Override
    public String toString() {
        return "Secretaria{" + "telefonoMobil=" + telefonoMobil + '}';
    }
    @Override
    public float calcularSoldo(String nome) {
        float soldo = 546f;
        return soldo;
    }
     public float calcularSoldo() {
        float soldo = 546f+super.calcularSoldo("dfs");
        return soldo;
    }
    
}
