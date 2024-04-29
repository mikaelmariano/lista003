import br.edu.up.modelos.Estudante25;
import java.util.Scanner;

public class Ex25CalculoClassificacao {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de matrícula do estudante: ");
        int numeroMatricula = scanner.nextInt();

        System.out.print("Digite a nota do trabalho de laboratório: ");
        double notaLaboratorio = scanner.nextDouble();

        System.out.print("Digite a nota da avaliação semestral: ");
        double notaSemestral = scanner.nextDouble();

        System.out.print("Digite a nota do exame final: ");
        double notaExameFinal = scanner.nextDouble();

        Estudante25 estudante = new Estudante25(nome, numeroMatricula, notaLaboratorio, notaSemestral, notaExameFinal);
        estudante.mostrarInformacoes();

        scanner.close();
    }
}
