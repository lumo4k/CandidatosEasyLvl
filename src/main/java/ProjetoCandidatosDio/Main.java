package ProjetoCandidatosDio;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");

        imprimirSelecionados();
    }

    public static String analisarSalario(double salario) {
        int SalarioPadrao = 2000;
        if (salario > SalarioPadrao) {
            return "LIGAR PARA CANDIDATO";
        } else if (salario == SalarioPadrao) {
            return "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA";
        } else {
            return "AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS";
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioPadrao = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioPretendido >= salarioPadrao) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de número " + (i + 1) + " com o nome " + candidatos[i] + " foi selecionado!");
        }
    }
}