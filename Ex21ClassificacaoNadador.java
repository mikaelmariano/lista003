import br.edu.up.modelos.Nadador21;
import java.util.Scanner;

//21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
//    Infantil A = 5 - 7 anos
//    Infantil B = 8 - 10 anos
//    juvenil A = 11- 13 anos
//    juvenil B = 14 - 17 anos
//    Sênior = 18 - 25 anos 
//    Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado.

public class Ex21ClassificacaoNadador {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        Nadador21 nadador = new Nadador21(idade);
        String categoria = nadador.classificarCategoria();

        System.out.println("Categoria do nadador: " + categoria);

        scanner.close();
    }
}
