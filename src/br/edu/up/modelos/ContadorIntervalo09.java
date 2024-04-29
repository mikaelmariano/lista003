package br.edu.up.modelos;
import java.util.Scanner;

public class ContadorIntervalo09 {
    public static int contarNumerosNoIntervalo() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 80; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        scanner.close();
        return contador;
    }
}
