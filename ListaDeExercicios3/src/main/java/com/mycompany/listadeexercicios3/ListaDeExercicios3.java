
package com.mycompany.listadeexercicios3;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class ListaDeExercicios3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n;
        System.out.println("Informe sua nota: ");
        n = (int) ler.nextInt ();
        if (n >= 1 || n <= 10){
            System.out.println("Sua nota é de: " + n); 
        } else {
            System.out.println("Valor inválido");
        }
    }
}
