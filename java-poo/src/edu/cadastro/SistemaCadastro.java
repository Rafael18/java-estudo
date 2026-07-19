package edu.cadastro;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", "123.456.789-00");
        pessoa1.setEndereco("Rua A, 123");
        System.out.println("Pessoa 1: " + pessoa1.getNome() + "\nCPF: " + pessoa1.getCpf() + "\nEndereço: " + pessoa1.getEndereco());
    }
}
