package exepaquetes;
/*Importamos la clase Reparacion del paquete taller, si le quitamos el public a nuestra clase, 
*por lo tanto sería por defecto, no podremos acceder a el desde fuera del paquete.
*/

import informatica.*;//Con el * nos importa todas las clases del paquete.
import taller.Reparacion;
//import alamacen.Saida; No es necesario porque nos da conflicto.
//import taller.Saida;
/**
 *
 * @author finfanterodal
 */
public class ExePaquetes {

    public static void main(String[] args) {
        
    Reparacion taller=new Reparacion();
    taller.autobúsRematado();
    /*Para que no haya conflicto porque las clases se llaman igual utilizamos la ruta 
     *absoluta para crear un objeto de estas clases.*/
    almacen.Saida saida=new almacen.Saida();
    taller.Saida saida2=new taller.Saida();
    //Objeto de tipo programadores
    Programadores programador=new Programadores();
    //Objeto de tipo sistemas
    Sistemas sistema=new Sistemas();
    }
    
}
