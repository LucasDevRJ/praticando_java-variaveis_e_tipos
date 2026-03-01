/**
 * Você está iniciando suas atividades como pessoa desenvolvedora e foi designado para criar um programa de cadastro
 * de livros que será escolhida através de um único caractere. O sistema armazenar em variáveis:
 *
 * Título
 * Autor
 * Número de páginas
 * Preço de um livro
 * Categoria do livro As categorias disponíveis são:
 * F - Ficção
 * N - Não-ficção
 * T - Tecnologia
 * H - História
 *
 * Escreva um programa que armazene em variáveis as informações de um livro e com base na categoria armazenada exiba
 * uma mensagem de confirmação de acordo com o que foi escolhido.
 */

package com.github.lucasdevrj.principal;

public class CadastroDeLivros {
    public static void main(String[] args) {
        String titulo, autor, categoria;
        int numeroDePaginas;
        double preco;
        char siglaDaCategoria;

        titulo = "O Silêncio dos Inocentes: Entre Cordeiros e Monstros";
        autor = " Yvonne Tasker";
        categoria = "Ficção";
        numeroDePaginas = 256;
        preco = 63.08;
        siglaDaCategoria = 'F';

        System.out.printf("Livro cadastrado: \"%s\", de %s. Ele possui %d páginas, custa R$%.2f e pertence à categoria Ficção.",
                titulo, autor, numeroDePaginas, preco, categoria);
    }
}
