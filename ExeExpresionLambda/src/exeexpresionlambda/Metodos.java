package exeexpresionlambda;

/**
 *
 * @author finfanterodal
 */
public class Metodos { //No necesitamos poner implements porque esta clase no la implementa sino la clase anónima que metimos en el método

    public void crearLambda() {
        /* IOperable op = new IOperable() {
            @Override
            public double operacion(double n1, double n2) {
                return n1 + n2;
            }
        };*/
        //se utilizan las lambdas para implementar métodos de interfaces funcionales
        IOperable op1 = (double n1, double n2) -> {return (n1 + n2);};

        op1.amosar();
        System.out.println("Operación -->" + op1.operacion(5, 10));
        
        
        //Para realizar otra operación
        IOperable op2 = (n1,n2) -> {return (n1 - n2);};
        System.out.println("Operación2 -->" + op2.operacion(5, 10));
    }
}
