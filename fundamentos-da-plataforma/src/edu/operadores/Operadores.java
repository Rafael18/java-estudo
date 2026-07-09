package edu.operadores;

public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        int numero1 = 5;
        int numero2 = 10;

        boolean simNao = numero1 != numero2;

        System.out.println("numero1 é diferente de numero2? " + simNao);

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }
    }
}