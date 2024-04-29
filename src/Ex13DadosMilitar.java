import br.edu.up.modelos.Pessoa13;
import java.util.Scanner;

public class Ex13DadosMilitar {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas você deseja verificar? ");
        int quantidadePessoas = scanner.nextInt();
        scanner.nextLine(); 

        Pessoa13[] pessoas = new Pessoa13[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo da pessoa (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); 

            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("A pessoa tem boa saúde? (true/false): ");
            boolean saude = scanner.nextBoolean();
            scanner.nextLine(); 

            pessoas[i] = new Pessoa13(nome, sexo, idade, saude);
        }

        Pessoa13.contarAptos(pessoas);

        scanner.close();
    }
}
