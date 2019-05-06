package exemplo_if;

import java.util.Scanner;

/**
 *
 * @author finfanterodal
 */
public class CondicionalSimple {

    public void maiorEdade() {
        Scanner res = new Scanner(System.in);
        System.out.println("\nIntroduce a idade: ");
        int idade = res.nextInt();
        if (idade < 18) {
            System.out.println("\nÉ menor de idade.");
        }
        System.out.println("\n***Remata o programa***");
    }
}
