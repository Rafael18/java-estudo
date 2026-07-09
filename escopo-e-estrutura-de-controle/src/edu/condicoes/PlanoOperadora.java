package edu.condicoes;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T":
                System.out.println("Você escolheu o plano Básico.");
            case "M":
                System.out.println("Você escolheu o plano Intermediário.");
            case "B":
                System.out.println("Você escolheu o plano Premium.");
        }
    }
}
