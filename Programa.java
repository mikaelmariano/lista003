import br.edu.up.util.Prompt;

public class Programa {
    public static void main(String[] args) {

    int numex = Prompt.lerInteiro("Digite o número do Exercicio que deseja executar: ");

    switch (numex) {
        case 1:
            Ex01Aluno.executar();
            break;

        default:
            System.out.println("Exercício não encontrado!");
            break;
        }
    }
}