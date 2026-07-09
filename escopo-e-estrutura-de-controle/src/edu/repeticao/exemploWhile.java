package edu.repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class exemploWhile {
    public static void main(String[] args) {
        
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Valor do doce: " + valorDoce + " Adicionado no carriho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a mesada com doces!");
    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
