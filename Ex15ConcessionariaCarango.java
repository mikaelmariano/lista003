import br.edu.up.modelos.Veiculo15;
import java.util.Scanner;

//15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Façaum programa que 
//    calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O descontodeverá ser calculado sobre o
//    valor do veículo de acordo com o combustível (álcool – 25%, gasolina– 21% ou diesel –14%). Com valor do 
//    veículo zero encerra entrada de dados.Informe total dedesconto e total pago pelos clientes.

public class Ex15ConcessionariaCarango {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à concessionária CARANGO!");

        Veiculo15[] veiculos = new Veiculo15[100];
        int indice = 0;
        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.print("Digite o tipo de combustível (álcool/gasolina/diesel): ");
            String tipoCombustivel = scanner.nextLine();

            if (tipoCombustivel.equalsIgnoreCase("zero")) {
                break; 
            }

            System.out.print("Digite o valor do veículo: ");
            double valorVeiculo = scanner.nextDouble();
            scanner.nextLine();

            veiculos[indice] = new Veiculo15(tipoCombustivel, valorVeiculo);
            totalDesconto += veiculos[indice].getValorDesconto();
            totalPago += veiculos[indice].calcularValorPago();
            indice++;
        }

        System.out.println("Total de desconto: " + totalDesconto);
        System.out.println("Total pago pelos clientes: " + totalPago);

        scanner.close();
    }
}
