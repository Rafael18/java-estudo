package edu.repeticao;

public class ExemploForDois {
    public static void main(String[] args) {
        
        // Em arrays, o índice começa em 0 e vai até o tamanho do array - 1
        String alunos[] = {"Ana", "Bia", "Carlos", "Daniel", "Eduardo"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("Aluno: " + alunos[x]);
        }

        // o For aprimorado (enhanced for) é uma forma mais simples de percorrer arrays e coleções
        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno);
        }
    }
}
