/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeHerdanza;

import static java.sql.DriverManager.println;

/**
 *
 * @author finfanterodal
 */
public class PH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        c1 obj1 = new c1();
        c2 obj2 = new c2();
        c3 obj3 = new c3();
        c4 obj4 = new c4();

        System.out.println("obj1.test = " + obj1.test());

        System.out.println("obj1.result1 = " + obj1.result1());

        System.out.println("obj2.test = " + obj2.test());

        System.out.println("obj2.result1 = " + obj3.result1());

        System.out.println("obj3.test = " + obj3.test());

        System.out.println("obj4.result1 = " + obj4.result1());

        System.out.println("obj3.result2 = " + obj3.result2());

        System.out.println("obj4.result2 = " + obj4.result2());

        System.out.println("obj3.result3 = " + obj3.result3());

        System.out.println("obj4.result3 = " + obj4.result3());

    }

}
