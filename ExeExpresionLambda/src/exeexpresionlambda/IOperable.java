package exeexpresionlambda;

/**
 *
 * @author finfanterodal
 */
@FunctionalInterface
public interface IOperable {

    public abstract double operacion(double n1, double n2);

    default void amosar() {
        System.out.println("Default");
    }

}
