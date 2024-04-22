import java.util.Scanner;

//1. Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteveno 
//   semestre. No final informar o nome do aluno e a sua média (aritmética).

// Classe principal do programa
public class Ex01Aluno {

    // Classe que representa um aluno
    static class Aluno {
        String nome;
        double nota1, nota2, nota3;

        // Construtor para inicializar os atributos
        public Aluno(String nome, double nota1, double nota2, double nota3) {
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        // Método para calcular a média das notas do aluno
        public double calcularMedia() {
            // Média aritmética = (nota1 + nota2 + nota3) / 3
            return (nota1 + nota2 + nota3) / 3.0;
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do aluno
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Digite a nota da primeira prova:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da terceira prova:");
        double nota3 = scanner.nextDouble();

        // Criar um objeto Aluno com as informações fornecidas
        Aluno aluno = new Aluno(nomeAluno, nota1, nota2, nota3);

        // Calcular a média do aluno
        double media = aluno.calcularMedia();

        // Exibir o nome do aluno e sua média
        System.out.println("\nNome do aluno: " + aluno.nome);
        System.out.println("Média do aluno: " + media);

        scanner.close();
    }
}
