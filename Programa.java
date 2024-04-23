import br.edu.up.util.Prompt;

public class Programa {
    public static void main(String[] args) {

    int numex = Prompt.lerInteiro("Digite o número do Exercicio que deseja executar: ");

    switch (numex) {
        case 1:
            Ex01Aluno.executar();
            break;
        
        case 2:
        Ex02ConsumoMedio.executar();
        break;    

        case 3:
        Ex03NomeVendedor.executar();
        break;
        
        case 4:
        Ex04ConversorDolarReal.executar();
        break;  

        default:
            System.out.println("Exercício não encontrado!");
            break;
        }
    }
}