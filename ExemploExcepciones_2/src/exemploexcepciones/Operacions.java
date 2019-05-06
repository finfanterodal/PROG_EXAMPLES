/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Operacions {

    //Atributos.
    private int num1;
    private int num2;
    //Constructores.

    //Métodos.
    public void suma(int num1, int num2) {
        System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
    }

    /*Arreglar excepciones:
    1.Para arreglar la excepción podemos comprobar que el denominador no sea 0.
    2.Utilizando excepciones de java.
     */
//1.
    public void cocienteConCondicionales(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir entre 0.");
        } else {
            System.out.println(num1 + ":" + num2 + " = " + (num1 / num2));
        }
    }
//2.

    public void cocienteCoExcepciones(int num1, int num2) {
        System.out.println("Antes de la excepción.");
        try {
            System.out.println(num1 + ":" + num2 + " = " + (num1 / num2));
        } catch (ArithmeticException e1) {
            //Utilizamos varios métodos que nos dan información sobre la excepción. 
            System.out.println("**No se puede dividir entre 0.**" + "\n" + e1.getMessage() + "\n" + e1.getLocalizedMessage() + "\n" + e1.toString());
        }
        System.out.println("Después de la excepción.");
    }
//Otros métodos.

    public void producto(int num1, int num2) {
        System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
    }

    public void resta(int num1, int num2) {
        System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
    }

//Dividir lanzando excepción.
    public void cocienteLanzandoExceociones(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            /*Opción1. ArithmeticException e1 = new ArithmeticException("No se puede dividir entre 0.");
            throw e1;*/
 /*Opción2.*/
            throw new ArithmeticException("No se puede dividir entre 0");
        } else {
            System.out.println(num1 + ":" + num2 + " = " + (num1 / num2));
        }

    }

    //Excepciones DEFINIDAS
    public void concienteExcepcionDefinida() throws CocienteException {
        num2=Integer.parseInt(JOptionPane.showInputDialog("Denominador"));
        if (num2 == 0) {
            throw new CocienteException("no dividir entre 0");
        } else {
            System.out.println(num1 + ":" + num2 + " = " + (num1 / num2));
        }
    }

    public void intervaloExceptionDefinida() throws IntervaloException {
        num1=Integer.parseInt(JOptionPane.showInputDialog("Numerador"));
        if ((num1<80) || (num1>100))
          throw new IntervaloException("Número fuera del intervalo");  
        else
          this.num1=num1;  
    }

}
