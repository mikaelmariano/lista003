import java.util.Scanner;
import br.edu.up.modelos.Conta22;

public class Ex22CalculoContaLuz {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria): ");
        int tipoCliente = scanner.nextInt();

        System.out.print("Digite a quantidade de quilowatts consumidos: ");
        int quantidadeKWh = scanner.nextInt();

        Conta22 contaDeLuz = new Conta22(tipoCliente, quantidadeKWh);
        double valorConta = contaDeLuz.calcularValorConta();

        System.out.println("Valor da conta de luz: R$" + valorConta);

        scanner.close();
    }
}
