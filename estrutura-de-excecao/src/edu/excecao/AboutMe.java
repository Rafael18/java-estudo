package edu.excecao;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura em metros (ex.: 1.75): ");
            double height = scanner.nextDouble();

            System.out.println("\nSobre mim:");
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + height + " metros");

            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser números");
        }
        
    }
}