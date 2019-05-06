package exemplo_if;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class CondicionalAnidado {

    //Scanner res = new Scanner(System.in);

    /*public void maiorMenorNum() {

       System.out.println("\nIntroduce num1: ");
        int num1 = res.nextInt();
        System.out.println("\nIntroduce a num2: ");
        int num2 = res.nextInt();
        if (num1 > num2) {
            if (num1 < num2) {
                System.out.println(num1 + "\nÉ menor.");
            } else {
                System.out.println("\nSon iguais.");
            }
        } else {
            System.out.println(num1 + "\nÉ maior.");
        }
        System.out.println("\n***Remata o programa***");
    }*/
    public void avaliarCondicionais() {
        //Creamos variables:
        int num1;
        int num2;
        //utilizamos JOptionPane.showInputDialog para introducir un dato:
        String numero1 = JOptionPane.showInputDialog("\nIntroduzca el primer número: ");
        String numero2 = JOptionPane.showInputDialog("\nIntroduzca el primer número: ");
        //Pasamos de String a Int, utilizando la clase Integer y su método parseInt:
        num1 = Integer.parseInt(numero1);
        num2 = Integer.parseInt(numero2);
        //Directamente sin hacer dos pasos:        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca el primer número: "));
        //Condicional if Anidado:
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "\n" + num1 + " é maior que " + num2);
        } /*else {
            if (num1 < num2) {
                System.out.println("\n"+num1 + " é menor que "+ num2);
            } else {
                System.out.println("\nSon iguais.");
            }
        }*/ //Tamén se pode facer:
        else if (num1 < num2) {
            JOptionPane.showMessageDialog(null, "\n" + num1 + " é menor que " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "\nSon iguais.");
        }

        System.out.println("\n***Remata o programa***");
    }
}
