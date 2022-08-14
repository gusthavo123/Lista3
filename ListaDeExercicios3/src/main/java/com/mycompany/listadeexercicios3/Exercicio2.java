
package com.mycompany.listadeexercicios3;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String nome = null; String senha = null;
        System.out.println("Informe seu nome: ");
        nome = ler.next ();
        System.out.println("Informe sua senha: ");
        senha = ler.next ();
        if (nome.equals(senha)){
            System.out.println("Sua senha não pode ser igual o nome!");
        } else { 
            System.out.println("Cadastro feito!");
        }
    }
}
