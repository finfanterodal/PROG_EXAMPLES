/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exestatic;

/**
 *
 * @author finfanterodal
 */
public class Alumno {

    //Atributos
    private String name;
    private float grade;
    private int numReference;
    public static int reference = 6220;//Compartida por todos los objetos
    //Constructores

    public Alumno() {
        numReference = ++reference;
    }

    public Alumno(String name, float grade) {
        this.name = name;
        this.grade = grade;
        /*this.numReference=numReference;*/
        numReference = ++reference;
    }

    //Métodos
    /*public void setNumReference(int ref){
        numReference=ref;
    }
    public int getNumReference(){
        return numReference;
    }*/
    public void show() {
        System.out.println("\nNome: " + name + "\nNota: " + grade + "\nReferencia: "/*+reference*/ + numReference);        
    }
    public static int getReference(){
        return reference;
    }
    public float getrGrade(){
        return grade;
    }
   /* public satatic String getName(){
        return name; //variable name no static
    }*/
}
