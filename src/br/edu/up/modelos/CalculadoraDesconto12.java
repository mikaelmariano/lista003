package br.edu.up.modelos;
import java.util.Scanner;

public class CalculadoraDesconto12 {
    public static void calcularDesconto() {
        Scanner scanner = new Scanner(System.in);
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar;
        do {
            System.out.print("Digite o ano do veículo: ");
            int ano = scanner.nextInt();

            double desconto;
            if (ano <= 2000) {
                desconto = 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = 0.07;
            }

            System.out.print("Digite o valor do veículo: ");
            double valor = scanner.nextDouble();

            double valorDesconto = valor * desconto;
            double valorPago = valor - valorDesconto;

            System.out.println("Valor do desconto: " + valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: " + valorPago);

            totalGeral++;
            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        scanner.close();
    }
}
