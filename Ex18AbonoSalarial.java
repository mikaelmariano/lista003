import br.edu.up.modelos.Funcionario18;
import java.util.Scanner;


//18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostreo nome e o 
//    salário líquido acrescido do abono conforme o sexo e a idade:
//    Sexo Idade Abono
//    M    >= 30  100,00
//         < 30   50,00
//    F    >= 30  200,00
//         < 30   80,00

public class Ex18AbonoSalarial {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo do funcionário (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();

        Funcionario18 funcionario = new Funcionario18(nome, idade, sexo, salarioFixo);
        funcionario.mostrarInformacoes();

        scanner.close();
    }
}
