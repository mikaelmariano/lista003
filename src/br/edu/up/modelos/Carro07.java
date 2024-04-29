package br.edu.up.modelos;

public class Carro07 {
    private double custoFabrica;

    public Carro07(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double valorImpostos = custoFabrica * percentualImpostos;
        double custoDistribuidor = (custoFabrica + valorImpostos) * percentualDistribuidor;
        return custoFabrica + valorImpostos + custoDistribuidor;
    }
}