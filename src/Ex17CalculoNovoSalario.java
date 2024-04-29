import br.edu.up.modelos.Funcionario17;
import java.util.Scanner;

//17. Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário reajustado.
//    Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto àempresa vai aumentar sua 
//    folha de pagamento.

public class Ex17CalculoNovoSalario {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        Funcionario17 funcionario = new Funcionario17(nome, salario, salarioMinimo);
        double novoSalario = funcionario.calcularReajuste();

        System.out.println("\nInformações do funcionário:");
        funcionario.mostrarInformacoes(novoSalario);

        scanner.close();
    }
}
