package exemplo_if;

import java.util.Scanner;

/**
 * Saber se unha persoa é maior ou menor de idade
 * @author finfanterodal
 * @version 1.0
 */
public class CondicionalDoble {

    Scanner res = new Scanner(System.in);

    public void maiorMenorEdade() {

        System.out.println("\nIntroduce a idade: ");
        int idade = res.nextInt();
        if (idade < 18) {

            System.out.println("\nÉ menor de idade.");
        } else {
            System.out.println("\nÉ maior de idade.");
        }
        System.out.println("\n***Remata o programa***");
    }

    public void maiorMenor() {

        System.out.println("\nIntroduce a idade: ");
        int idade = res.nextInt();
        String resposta;
        if (idade < 18) {

            resposta = "\nÉ menor de idade.";
        } else {
            resposta = "\nÉ maior de idade.";
        }
        System.out.println("\n" + resposta);
        System.out.println("\n***Remata o programa***");
    }

    public void maiorMenorOperador() {

        System.out.println("\nIntroduce a idade: ");
        int idade = res.nextInt();
        String resposta;
        resposta = (idade < 18) ? "\nÉ menor de idade." : "\nÉ maior de idade.";
        System.out.println("\n" + resposta);
        System.out.println("\n***Remata o programa***");
    }

}
