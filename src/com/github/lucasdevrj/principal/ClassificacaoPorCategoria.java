/**
 * Você trabalha em um e-commerce e precisa classificar os produtos em diferentes categorias com base no preço.
 *
 * Escreva um programa que classifique um produto em uma categoria com base em um preço e exiba a categoria
 * correspondente, conforme as seguintes regras:
 *
 * Econômico: preço até R$ 50,00.
 * Intermediário: preço entre R$ 50,01 e R$ 200,00.
 * Premium: preço acima de R$ 200,00. Exemplo de entrada:
 */

package com.github.lucasdevrj.principal;

import java.util.Scanner;

public class ClassificacaoPorCategoria {
    public static void main(String[] args) {
        double preco = 0.0;
        String categoria = "Econômico";

        Scanner entradaDeDados = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$");
        preco = entradaDeDados.nextDouble();
        entradaDeDados.close();

        if (preco >= 50.01) {
            categoria = "Intermediário";
        }

        if (preco > 200.00) {
            categoria = "Premium";
        }

        System.out.println("Categoria do produto: " + categoria);
    }
}
