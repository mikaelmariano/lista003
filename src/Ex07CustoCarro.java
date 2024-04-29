import br.edu.up.util.Prompt;
import br.edu.up.modelos.Carro07;

//7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos 
//   impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor 
//   sobre o resultado). Supondo que a percentagem do distribuidor sejade 28% e os impostos 45%. Escrever um 
//   programa que leia o custo de fábrica de um carro e informeo custo ao consumidor do mesmo.

public class Ex07CustoCarro {
    public static void executar() {
    
            double custoFabrica = Prompt.lerDecimal("Digite o custo de fábrica do carro: ");
    
            Carro07 carro = new Carro07(custoFabrica);
            double custoConsumidor = carro.calcularCustoConsumidor();
    
            System.out.println("O custo ao consumidor do carro é: " + custoConsumidor);
        }
}