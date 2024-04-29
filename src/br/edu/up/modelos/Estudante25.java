package br.edu.up.modelos;

public class Estudante25 {
    private String nome;
    private int numeroMatricula;
    private double notaLaboratorio;
    private double notaSemestral;
    private double notaExameFinal;

    public Estudante25(String nome, int numeroMatricula, double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.notaLaboratorio = notaLaboratorio;
        this.notaSemestral = notaSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularNotaFinal() {
        double notaFinal = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
        return notaFinal;
    }

    public String calcularClassificacao() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 8) {
            return "A";
        } else if (notaFinal >= 7) {
            return "B";
        } else if (notaFinal >= 6) {
            return "C";
        } else if (notaFinal >= 5) {
            return "D";
        } else {
            return "R";
        }
    }

    public void mostrarInformacoes() {
        double notaFinal = calcularNotaFinal();
        String classificacao = calcularClassificacao();
        System.out.println("Nome: " + nome);
        System.out.println("Número de matrícula: " + numeroMatricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);
    }
}
