
package com.mycompany.listadeexercicios3;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n1, n2, n3, n4 , n5, m, s;
        System.out.println("Informe o numero 1: ");
        n1 = (int) ler.nextInt ();
        System.out.println("Informe o numero 2: ");
        n2 = (int) ler.nextInt ();
        System.out.println("Informe o numero 3: ");
        n3 = (int) ler.nextInt ();
        System.out.println("Informe o numero 4: ");
        n4 = (int) ler.nextInt ();
        System.out.println("Informe o numero 5: ");
        n5 = (int) ler.nextInt ();
        s = (int) (n1 + n2 + n3 + n4 + n5);
        m = s / 5;
        System.out.println("A soma dos números é de: " + s);
        System.out.println("A média dos números é de: " + m);
    }
}
