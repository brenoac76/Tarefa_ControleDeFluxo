package br.com.bcosta;

import java.util.Scanner;

public class Controle_de_fluxo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double somaNotas = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / 4;


        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5) {
            System.out.println("Aluno de recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }

}

