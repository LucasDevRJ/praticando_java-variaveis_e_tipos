package com.github.lucasdevrj.principal;

public class Principal {
    public static void main(String[] args) {
        //Variáveis e seus tipos de dados
        int quantidadeDePassos = 500;
        double alturaEmMetros = 1.60;
        String nome = "Lucas";

        //Conversão de tipos de variáveis (type casting)
        int alturaEmCentimetros = (int) (alturaEmMetros * 100);
        System.out.println("Altura em centimetros = " + alturaEmCentimetros + "cm.");

        alturaEmMetros  = alturaEmCentimetros / 100.0;
        System.out.println("Altura em metros = " + alturaEmMetros + "m.");

        int sugestaoDeQuantidadeDePassos = 1000;
        if (quantidadeDePassos < sugestaoDeQuantidadeDePassos) {
            String sugestao = "Sugiro que você tente aumentar a meta.";
            System.out.println(sugestao);
        }

        Paciente paciente1 = new Paciente();

    }
}
