
package com.mycompany.listadeexercicios3;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String nome = null; String sexo = null; String EC = null;
        int idade, sal; 
        System.out.println("Informe seu nome:");
        nome = ler.next ();
        while (nome.length () <= 3) {
            System.out.println("Inválido! Tamanho insuficiente!");
        nome = ler.next ();
        }
        System.out.println("Informe sua idade: ");
        idade = (int) ler.nextInt ();
        if (idade >= 0 || idade <= 150){
        } else { 
            System.out.println("ERROR!");
        idade = (int) ler.nextInt ();
        }
        System.out.println("Informe seu salário: ");
        sal = (int) ler.nextInt ();
        if  (sal == 0 || sal <= 0){
            System.out.println("ERROR! Salário tem que ser maior qeue 0!");
        sal = (int) ler.nextInt ();
        }
        System.out.println("Informe seu sexo: " + "\n" + "F - Feminino" + "\n" + "M - Masculino");
        sexo = ler.nextLine ();
        if (sexo.equals("F") || sexo.equals ("M")){
        } else { 
            System.out.println("ERROR!");
        }
        System.out.println("Informe seu estado civil: " + "\n" + "C - Casado" + "\n" + "S - Solteiro" + "\n" + "V - Viúvo" + "\n" + "D - Divorciado");
        EC = ler.nextLine ();
        if  (EC.equals ("C") || EC.equals ("S") || EC.equals ("V") || EC.equals ("D")){ 
        } else {
            System.out.println("ERROR!");
        }
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + sal);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + EC);
    }
}