import br.edu.up.modelos.Produto14;
import java.util.Scanner;

//14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado se 
//    houve lucro, prejuízo ou empate para cada produto. Informe média de preço decusto e do preço de venda.

public class Ex14CustoLucro {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        Produto14[] produtos = new Produto14[40];

        for (int i = 0; i < 40; i++) {
            System.out.print("Digite o preço de custo do produto " + (i + 1) + ": ");
            double precoCusto = scanner.nextDouble();

            System.out.print("Digite o preço de venda do produto " + (i + 1) + ": ");
            double precoVenda = scanner.nextDouble();

            produtos[i] = new Produto14(precoCusto, precoVenda);
        }

        for (int i = 0; i < 40; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            produtos[i].calcularLucroPrejuizoEmpate();
        }

        Produto14.calcularMedias(produtos);

        scanner.close();
    }
}
