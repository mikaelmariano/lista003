import java.util.Scanner;
import br.edu.up.modelos.Pessoa23;

public class Ex23CalculoPesoIdeal {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sexo da pessoa (M/F): ");
        String sexo = scanner.next();

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        Pessoa23 pessoa = new Pessoa23(nome, sexo, altura, idade);
        pessoa.mostrarPesoIdeal();

        scanner.close();
    }
}
