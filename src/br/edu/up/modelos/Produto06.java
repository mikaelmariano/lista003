package br.edu.up.modelos;

public class Produto06 {
    private double precoCusto;

    public Produto06(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double calcularPrecoVenda(double percentualAcrescimo) {
        return this.precoCusto * (1 + percentualAcrescimo / 100);
    }
}