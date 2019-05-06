package exepolimorfismoss;

import java.util.ArrayList;

/**
 *
 * @author finfanterodal
 */
public class ExePolimorfismoSS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Si no hay herencia no podemos utilizar el polmorfismo
        Persoa p1 = new Persoa("Juanes",200000);
        Persoa dep1 = new Deportista("Ciclista","Panadero",15000);
        Persoa prof1 = new Profesorado("Filólogo","Góngora",300000);

        System.out.println("PERSOA: " + p1.calcularSoldo());
        System.out.println("DEPORTISTA: " + dep1.calcularSoldo());
        System.out.println("PROFESORADO: " + prof1.calcularSoldo());
        
        
        //
        Deportista dep2=new Deportista();
        //Un deportista es una persona y por lo tanto no hay incompatibilidad
        p1=dep2;
        //En este caso una Persona puede no ser un deportista, y hay incompativilidad por lo que casteamos
        dep2=(Deportista)p1;
        //
        ArrayList<Persoa> lista=new ArrayList<>();
        lista.add(p1);
        lista.add(dep1);
        lista.add(prof1);
        //
        Metodos.amosar(lista);
    }

}
