package edu.condicoes;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 1000.0;
        double valorSaque = 999.0;

        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso.");
            System.out.println( "Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}