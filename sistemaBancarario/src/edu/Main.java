package edu;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco do Brasil");

        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(45, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
