import br.edu.up.modelos.Seguradora26;
import java.util.Scanner;

public class Ex26CalculoSegurado {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do pretendente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do pretendente: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o grupo de risco do pretendente (baixo, médio, alto): ");
        String grupoRisco = scanner.next();

        Seguradora26 seguradora = new Seguradora26(nome, idade, grupoRisco);
        String categoriaSeguro = seguradora.determinarCategoriaSeguro();

        System.out.println("Nome: " + nome);
        System.out.println("Categoria de seguro: " + categoriaSeguro);

        scanner.close();
    }
}