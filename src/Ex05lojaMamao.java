import br.edu.up.modelos.Compra05;
import br.edu.up.util.Prompt;

//5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
//   prestações sem juros.Faça um programa que receba um valor de uma 
//   compra e mostre o valor das prestações.


public class Ex05lojaMamao {

    // Método principal
    public static void executar() {
     
        double valorCompra = Prompt.lerDecimal("Digite o valor da compra:");

        // Criar um objeto Compra com o valor fornecido
        Compra05 compra = new Compra05(valorCompra);

        // Calcular o valor de cada prestação
        double valorPrestacao = compra.calcularPrestacoes();

        // Exibir o valor de cada prestação
        System.out.println("\nValor de cada prestação: R$" + valorPrestacao);

        
    }
}