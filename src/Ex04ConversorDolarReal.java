import br.edu.up.modelos.Conversor04;
import br.edu.up.util.Prompt;

//4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de umvalor lido em dólar
//   (US$). O programa deverá solicitar o valor da cotaçãodo dólar e também aquantidade de dólares disponíveis 
//   com o usuário.

public class Ex04ConversorDolarReal {
    // Método principal
    public static void executar() {

        // Solicitar a cotação do dólar e a quantidade de dólares disponíveis
        
        double cotacaoDolar = Prompt.lerDecimal("Digite a cotação do dólar (em reais):");
        double quantidadeDolares = Prompt.lerDecimal("Digite a quantidade de dólares disponíveis:");

        // Criar um objeto Conversor com a cotação do dólar fornecida
        Conversor04 conversor = new Conversor04(cotacaoDolar);

        // Calcular o valor em reais a partir da quantidade de dólares
        double valorEmReais = conversor.converterParaReal(quantidadeDolares);

        // Exibir o valor convertido em reais
        System.out.println("\nValor em reais: R$" + valorEmReais);

    }
}

