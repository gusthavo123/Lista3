
package com.mycompany.listadeexercicios3;
import java.util.Scanner;
/**
 *
 * @author gumiy
 */
public class Exercicio7 {
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
       float maior, num;
       int i = 2;
 
     System.out.print("Numero 1: ");
     num = (float) ler.nextFloat();
     maior = num;
 
     while(i <= 5){
      System.out.print("Numero " + i + ": ");
      num = (float) ler.nextFloat();
 
      if(num > maior){
       maior = num;
      }
      i = i + 1;
     }
 
     System.out.println("O maior numero digitado é: "+maior);

    }
}
