package edu.repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Break: Saindo do loop quando i é igual a " + i);
                break; // Sai do loop quando i é igual a 5
            }
            System.out.println("Continue: Valor de i = " + i);
        }

        System.out.println("Fim do programa.");
    }
}
