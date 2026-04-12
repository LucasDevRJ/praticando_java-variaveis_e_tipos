/**
 * Você está planejando uma viagem de carro e deseja calcular quantos quilômetros poderá percorrer com o combustível
 * disponível no tanque. Para isso, você precisa considerar:
 *
 * O consumo médio do veículo (km/l)
 * A capacidade total do tanque de combustível (litros)
 * A quantidade de combustível disponível no momento (litros)
 * A distância da viagem planejada (km)
 * Com essas informações, o programa deverá calcular:
 *
 * A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
 * A autonomia atual, baseada na quantidade de combustível disponível.
 * Se a quantidade de combustível atual será suficiente para percorrer um determinado trajeto informado pelo usuário.
 * Fórmulas de apoio:
 *
 * autonomia maxima=consumo medio×capacidade do tanque
 * autonomia atual=consumo medio×combustıvel disponivel
 */

package com.github.lucasdevrj.principal;

import java.util.Scanner;

public class PlanejandoUmaViagemConsumoEAutonomia {
    public static void main(String[] args) {
        double consumoMedioDoVeiculo, capacidadeTotalDoTanqueDeCombutivel, quantidadeDeCombustivelDisponivelNoMomento,
                distanciaDaViagemPlanejada, autonomiaMaxima, autonomiaAtual;
        String resposta;
        int quantidadeMinimaParaAbastecer;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o consumo médio do veículo (km/litros): ");
        consumoMedioDoVeiculo = entrada.nextDouble();

        System.out.print("Digite a capacidade total do tanque de combustível (litros): ");
        capacidadeTotalDoTanqueDeCombutivel = entrada.nextDouble();

        System.out.print("Digite a quantidade de combustível disponível (litros): ");
        quantidadeDeCombustivelDisponivelNoMomento = entrada.nextDouble();

        System.out.print("Digite a distância da viagem planejada (km): ");
        distanciaDaViagemPlanejada = entrada.nextDouble();

        entrada.close();

        autonomiaMaxima = consumoMedioDoVeiculo * capacidadeTotalDoTanqueDeCombutivel;
        autonomiaAtual = consumoMedioDoVeiculo * quantidadeDeCombustivelDisponivelNoMomento;

        if (autonomiaAtual >= distanciaDaViagemPlanejada) {
            resposta = "Você conseguirá completar a viagem sem precisar abastecer.";
        } else {
            double distanciaFaltante = distanciaDaViagemPlanejada - autonomiaAtual;
            quantidadeMinimaParaAbastecer = (int) Math.ceil(distanciaFaltante / autonomiaMaxima);
            resposta = "Você terá que abastecer pelo menos " + quantidadeMinimaParaAbastecer + " vezes.";
        }

        String resultado = """
                Autonomia máxima do veículo: %.1f km
                Autonomia atual: %.1f km
                %s
                """.formatted(autonomiaMaxima, autonomiaAtual, resposta);

        System.out.println();
        System.out.println(resultado);
    }
}
