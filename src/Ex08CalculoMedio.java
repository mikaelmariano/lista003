import br.edu.up.modelos.Aluno08;
import br.edu.up.util.Prompt;

//8. Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a 
//   sua média (aritmética),informar o nome e sua menção aprovado (media >= 7),Reprovado (media <= 5) e 
//   Recuperação (media entre 5.1 a 6.9).

public class Ex08CalculoMedio {
    public static void executar() {

        String nome = Prompt.lerLinha("Digite o nome do aluno: ");
        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota: ");

        Aluno08 aluno = new Aluno08(nome, nota1, nota2, nota3);
        double media = aluno.calcularMedia();
        String mencao = aluno.obterMencao();

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média: " + media);
        System.out.println("Menção: " + mencao);

    }
}
