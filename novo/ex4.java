/*
Faça um algoritmo que leia a idade de uma pessoa em anos e exiba essa idade
expressa em meses e dias. Considere um ano com 365 dias e um mês com 30 dias.
*/

import java.util.Scanner;

public class ex4 {
  public static void processamento(int idade){
    int mes=idade*12;
    int dia=mes*30;
    if

  }
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Informe sua idade: ");
    int idade=leitura.nextInt();
    processamento(idade);
  }
}
