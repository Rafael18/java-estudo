package edu.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String[] candidatos = {"Rodrigo", "André", "Mariana", "Felipe", "Guilherme"};
        // analisarCandidato(1800.0);
        // analisarCandidato(2000.0);
        // analisarCandidato(2200.0);

        // selecaoCandidatos();
        // imprimirSelecionados();
        for (String candidato : candidatos) {
            entrandoEmContado(candidato);
        }
    }

    static void entrandoEmContado(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato Realizado");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com o " + candidato + " na tentativa: " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com o " + candidato + " após " + tentativasRealizadas + " tentativas");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"Rodrigo", "André", "Mariana", "Felipe", "Guilherme"};

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é o: " + candidatos[indice]);
        }

        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Rodrigo", "André", "Mariana", "Felipe", "Guilherme", "Julia", "Paulo", "Amanda", "Flávia", "Bruna"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra-proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
