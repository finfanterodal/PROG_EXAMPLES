package exexenericos;

/**
 * Tenemos el problema del casteo.
 * Los problemas de tipo nos da en tiempo de ejecución.
 * Y es engorroso el código.
 * Para evitar esto utilizamos clases genéricas, interfaces genéricas o métodos genéricos.
 * @author finfanterodal
 */
public class ClaseObject {

    //
    private Object variable;

    //
    public ClaseObject() {
    }

    //
    public Object getVariable() {
        return variable;
    }

    public void setVariable(Object variable) {
        this.variable = variable;
    }

}
