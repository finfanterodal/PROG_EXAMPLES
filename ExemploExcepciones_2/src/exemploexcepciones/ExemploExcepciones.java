/*
 * Tratamiento de excepciones.
 */
package exemploexcepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author finfanterodal
 */
public class ExemploExcepciones {

    public static void main(String[] args) {
        //Objeto de clase
        Operacions operacion1 = new Operacions();
        //Llamamos a los métodos

        try {

            operacion1.intervaloExceptionDefinida();
            operacion1.concienteExcepcionDefinida();
        } catch (IntervaloException e1) {
            System.out.println(e1.getMessage());

        } catch (CocienteException e2) {
            System.out.println(e2.getMessage());
        }
        System.out.println("Fin programa");

    }

}
