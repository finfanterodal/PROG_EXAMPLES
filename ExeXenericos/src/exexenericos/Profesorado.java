package exexenericos;

/**
 *
 * @author finfanterodal
 */
public class Profesorado extends Persoa{
    //
    private String modulo;
    //

    public Profesorado() {
    }


    public Profesorado(String modulo, String nome, float soldo) {
        super(nome, soldo);
        this.modulo = modulo;
    }
    //

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    //

    @Override
    public String toString() {
        return super.toString()+"\nmodulo=" + modulo;
    }
    
    
    
}
