package edu.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");
        aluno1.setIdade(20);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");
        aluno2.setIdade(22);

        System.out.println("Aluno 1: " + aluno1.getNome() + ", Idade: " + aluno1.getIdade());
        System.out.println("Aluno 2: " + aluno2.getNome() + ", Idade: " + aluno2.getIdade());
    }
}
