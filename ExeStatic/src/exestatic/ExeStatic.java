package exestatic;

/**
 *
 * @author finfanterodal
 */
public class ExeStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumn1 = new Alumno("Fran", 10f/*,6221*/);
        alumn1.show();
        Alumno alumn2 = new Alumno("Parcero", 5f/*,6220*/);
        alumn2.show();
        Alumno alumn3 = new Alumno();
        alumn3.show();
        alumn1.show();
        System.out.println("\nReferencia: "+Alumno.reference);
        System.out.println("\nReferencia: "+alumn2.reference);
        System.out.println("\nReferencia: "+Alumno.getReference());
    }

}
