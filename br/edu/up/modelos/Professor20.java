package br.edu.up.modelos;

public class Professor20 {
    private int nivel;
    private double valorHoraAula;

    public Professor20(int nivel) {
        this.nivel = nivel;
        definirValorHoraAula();
    }

    private void definirValorHoraAula() {
        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível de professor inválido.");
        }
    }

    public double calcularSalario(int horasAula) {
        return valorHoraAula * horasAula;
    }
}
