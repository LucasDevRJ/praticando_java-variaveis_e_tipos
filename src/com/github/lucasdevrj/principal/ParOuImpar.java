/**
 * Você está desenvolvendo um jogo e quer um programa que determine se um número é par ou ímpar.
 *
 * Escreva um programa que classifique um número e exiba uma mensagem informando se o número é par ou ímpar.
 */

package com.github.lucasdevrj.principal;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 0;
        int resto;

        Scanner entradaDeDados = new Scanner(System.in);

        System.out.print("Digite um número inteiro qualquer: ");
        numero = entradaDeDados.nextInt();
        entradaDeDados.close();

        resto = numero % 2;

        if (resto == 0) {
            System.out.println("Número é par.");
        } else {
            System.out.println("Número é ímpar.");
        }
    }
}
