import br.edu.up.modelos.Produto06;
import br.edu.up.util.Prompt;

//6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço 
//   de custo receberá um acréscimo de acordo com um percentual informado pelousuário.

public class Ex06CalculoPrecoVenda {

    public static void executar() {
    
            double precoCusto = Prompt.lerDecimal("Digite o preço de custo do produto: ");
            double percentualAcrescimo = Prompt.lerDecimal("Digite o percentual de acréscimo (%): ");
    
            Produto06 produto = new Produto06(precoCusto);
            double precoVenda = produto.calcularPrecoVenda(percentualAcrescimo);
    
            System.out.println("O preço de venda do produto é: " + precoVenda);

        }
}