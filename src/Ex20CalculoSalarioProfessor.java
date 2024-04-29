import br.edu.up.modelos.Professor20;
import java.util.Scanner;

//20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programaque calcule e exiba
//    o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
//    Professor Nível 1 R$12,00 por hora/aula
//    Professor Nível 2 R$17,00 por hora/aula
//    Professor Nível 3 R$25,00 por hora/aula
public class Ex20CalculoSalarioProfessor {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nível do professor (1, 2 ou 3): ");
        int nivel = scanner.nextInt();

        System.out.print("Digite a quantidade de horas/aula: ");
        int horasAula = scanner.nextInt();

        Professor20 professor = new Professor20(nivel);
        double salario = professor.calcularSalario(horasAula);

        System.out.println("O salário do professor é: R$" + salario);

        scanner.close();
    }
}
