package br.edu.up.modelos;

import java.util.Scanner;

public class VerificadorIdade10 {
    public static void verificarIdades() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas você deseja verificar a idade? ");
        int quantidadePessoas = scanner.nextInt();

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                System.out.println("Pessoa " + i + ": Maior de idade");
            } else {
                System.out.println("Pessoa " + i + ": Menor de idade");
            }
        }

        scanner.close();
    }
}