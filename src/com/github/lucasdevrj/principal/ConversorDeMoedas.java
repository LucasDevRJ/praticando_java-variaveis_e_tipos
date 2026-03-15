/**
 * Você está organizando uma viagem internacional e precisa converter uma quantia em reais (R$) para
 * dólares americanos (US$) com base na taxa de câmbio atual. A taxa utilizada no momento é de R$ 5,25 para cada US$ 1.
 *
 * Crie um programa que realize a conversão para dólares usando a taxa de câmbio e exiba o valor convertido.
 */

package com.github.lucasdevrj.principal;

import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        double valorEmReal = 0.0;
        double valorEmDolar = 0.0;

        Scanner entradaDeDados = new Scanner(System.in);

        System.out.print("Digite o valor em reais: R$ ");
        valorEmReal = entradaDeDados.nextDouble();
        entradaDeDados.close();

        valorEmDolar = valorEmReal / 5.25;

        System.out.printf("O valor em dólares é: US$ %.2f", valorEmDolar);
    }
}
