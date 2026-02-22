/**
 * Você está começando seus primeiros passos na programação em Java e deseja reforçar
 * seu aprendizado sobre declaração de variáveis.
 *
 * Escreva um programa que declare variáveis para o seu nome, idade, altura
 * e se você é estudante, utilizando os tipos apropriados, e depois exiba os
 * valores armazenados.
 */

package com.github.lucasdevrj.principal;

public class DeclarandoValoresAVariaveis {
    public static void main(String[] args) {
        String nome = "Lucas";
        int idade = 26;
        double altura = 1.83;
        boolean ehEstudante = true;

        String informacoes = """
                Nome: %s
                Idade: %d
                Altura: %.2f
                É estudante: %b
                """.formatted(nome, idade, altura, ehEstudante);

        System.out.println(informacoes);
    }
}
