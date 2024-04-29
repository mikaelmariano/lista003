import br.edu.up.modelos.Estudante24;
import java.util.Scanner;

public class Ex24CalculoNota {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do trabalho de laboratório: ");
        double notaLaboratorio = scanner.nextDouble();

        System.out.print("Digite a nota da avaliação semestral: ");
        double notaSemestral = scanner.nextDouble();

        System.out.print("Digite a nota do exame final: ");
        double notaExameFinal = scanner.nextDouble();

        Estudante24 estudante = new Estudante24(notaLaboratorio, notaSemestral, notaExameFinal);
        double notaFinal = estudante.calcularNotaFinal();

        System.out.println("A nota final do estudante é: " + notaFinal);

        scanner.close();
    }
}
