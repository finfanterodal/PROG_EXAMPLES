/*
 *Creamos una clase para una excepcion definida por nosotros.
 */
package exemploexcepciones;

/**
 *
 * @author finfanterodal
 */
public class CocienteException extends Exception {
//Constructor por defecto
    public CocienteException() {
        super();
    }
//Constructor definido
        public CocienteException(String msg) {
            super(msg);
    }
}
