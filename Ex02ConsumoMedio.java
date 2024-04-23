import br.edu.up.modelos.Automovel02;
import br.edu.up.util.Prompt;

// 2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância
//    total percorrida pelo automóvel e o total de combustível gasto.

// Classe principal do programa
public class Ex02ConsumoMedio {

    public static void executar() {

        // Solicitar informações do automóvel
        
        double distanciaPercorrida = Prompt.lerDecimal("Digite a distância total percorrida pelo automóvel:");
        double combustivelGasto = Prompt.lerDecimal("Digite o total de combustível gasto pelo automóvel:");

        // Criar um objeto Automovel com as informações fornecidas
        Automovel02 automovel = new Automovel02(distanciaPercorrida, combustivelGasto);

        // Calcular o consumo médio do automóvel
        double consumoMedio = automovel.calcularConsumoMedio();

        // Exibir o consumo médio
        System.out.println("\nConsumo médio do automóvel: " + consumoMedio + " km/l");


    }
}
