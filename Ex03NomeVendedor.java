import br.edu.up.modelos.Vendedor03;
import br.edu.up.util.Prompt;

//3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
//   efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobresuas 
//   vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.

public class Ex03NomeVendedor {

    public static void executar() {

        String nome = Prompt.lerLinha("Digite o nome do vendedor:");
        double salarioFixo = Prompt.lerDecimal("Digite o salário fixo do vendedor:");
        double totalVendas = Prompt.lerDecimal("Digite o total de vendas efetuadas pelo vendedor:");

        // Criar um objeto Vendedor com as informações fornecidas
        Vendedor03 vendedor = new Vendedor03(nome, salarioFixo, totalVendas);

        // Calcular o salário final do vendedor
        double salarioFinal = vendedor.calcularSalarioFinal();

        // Exibir os resultados usando os métodos de acesso (getters) da classe Vendedor03
        System.out.println("\nInformações do vendedor:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salário Fixo: R$" + vendedor.getSalarioFixo());
        System.out.println("Salário Final: R$" + salarioFinal);

    }
}
