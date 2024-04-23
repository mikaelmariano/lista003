package br.edu.up.modelos;

public class Aluno08 {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno08(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String obterMencao() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado";
        } else if (media <= 5) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }

    public String getNome() {
        return nome;
    }
}
