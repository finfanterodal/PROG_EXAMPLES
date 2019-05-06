package exemplo_if;

/**
 *
 * @author finfanterodal
 */
public class Exemplo_if {
    
    public static void main(String[] args) {
        
        CondicionalSimple obxCondicional = new CondicionalSimple();
        CondicionalDoble obxCondicionalDoble = new CondicionalDoble();
        CondicionalAnidado obxCondicionalA = new CondicionalAnidado();
        obxCondicional.maiorEdade();
        obxCondicionalDoble.maiorMenorEdade();
        obxCondicionalDoble.maiorMenor();
        obxCondicionalDoble.maiorMenorOperador();
        obxCondicionalA.avaliarCondicionais();
    
    }
    
}
