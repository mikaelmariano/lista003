package br.edu.up.modelos;

// Classe principal do programa
public class Conversor04 {
    private double cotacaoDolar;

    // Construtor para inicializar o valor da cotação do dólar
    public Conversor04(double cotacaoDolarParam) {
        cotacaoDolar = cotacaoDolarParam;
    }

    // getters para acessar os campos privados
    public double getCotacao() {
        return cotacaoDolar;
    }

    // Método para calcular o valor em reais a partir de uma quantidade de dólares
    public double converterParaReal(double quantidadeDolares) {
        return quantidadeDolares * cotacaoDolar;
    }
}