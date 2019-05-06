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
       /* operacion1.suma(8, 2);
        operacion1.cocienteCoExcepciones(8, 2);
        operacion1.cocienteConCondicionales(8, 2);
        operacion1.resta(8, 2);
        
        operacion1.suma(8, 0);
        //Nos da una excepción de tipo ArithmeticException(es una clase), cuando tratamos de dividir entre 0.
        operacion1.cocienteConCondicionales(8, 0);
        operacion1.cocienteCoExcepciones(8, 0);
//        operacion1.resta(8, 0);*/
//       try{
//        operacion1.cocienteLanzandoExceociones(8, 0);
//       }catch(ArithmeticException e1){
//           System.out.println(e1.getMessage());
//       }
//       }
    

            try {
                operacion1.concienteExcepcionDefinida(8, 0);
            } catch (CocienteException ex) {
              System.out.println(ex.getMessage());
            }
                System.out.println("Fin program");
       }

    
       
}
