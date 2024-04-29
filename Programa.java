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

        case 5:
        Ex05lojaMamao.executar();
        break;

        case 6:
        Ex06CalculoPrecoVenda.executar();
        break;

        case 7:
        Ex07CustoCarro.executar();
        break;

        case 8:
        Ex08CalculoMedio.executar();
        break;

        case 9:
        Ex09Intervalo.executar();
        break;

        case 10:
        Ex10IdadeNumero.executar();
        break;

        case 11:
        Ex11NomeSexo.executar();
        break;

        case 12:
        Ex12CalculoDesconto.executar();
        break;

        case 13:
        Ex13DadosMilitar.executar();
        break;

        case 14:
        Ex14CustoLucro.executar();
        break;

        case 15:
        Ex15ConcessionariaCarango.executar();
        break;

        case 16:
        Ex16ReajusteSalarial.executar();
        break;

        case 17:
        Ex17CalculoNovoSalario.executar();
        break;

        case 18:
        Ex18AbonoSalarial.executar();
        break;

        case 19:
        Ex19VerificacaoTriangulo.executar();
        break;

        case 20:
        Ex20CalculoSalarioProfessor.executar();
        break;

        case 21:
        Ex21ClassificacaoNadador.executar();
        break;

        case 22:
        Ex22CalculoContaLuz.executar();
        break;

        case 23:
        Ex23CalculoPesoIdeal.executar();
        break;

        case 24:
        Ex24CalculoNota.executar();
        break;

        case 25:
        Ex25CalculoClassificacao.executar();
        break;

        case 26:
        Ex26CalculoSegurado.executar();
        break;

        default:

            System.out.println("Exercício não encontrado!");
            break;
        }
    }
}