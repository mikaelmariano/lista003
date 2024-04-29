package br.edu.up.modelos;

public class Veiculo15 {
    private String tipoCombustivel;
    private double valorVeiculo;
    private double valorDesconto;

    public Veiculo15(String tipoCombustivel, double valorVeiculo) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorVeiculo = valorVeiculo;
        this.valorDesconto = calcularDesconto();
    }

    public double calcularDesconto() {
        double desconto = 0;

        switch (tipoCombustivel.toLowerCase()) {
            case "álcool":
                desconto = valorVeiculo * 0.25;
                break;
            case "gasolina":
                desconto = valorVeiculo * 0.21;
                break;
            case "diesel":
                desconto = valorVeiculo * 0.14;
                break;
            default:
                System.out.println("Tipo de combustível inválido.");
        }

        return desconto;
    }

    public double calcularValorPago() {
        return valorVeiculo - valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public static double calcularTotalDesconto(Veiculo15[] veiculos) {
        double totalDesconto = 0;

        for (Veiculo15 veiculo : veiculos) {
            totalDesconto += veiculo.getValorDesconto();
        }

        return totalDesconto;
    }

    public static double calcularTotalPago(Veiculo15[] veiculos) {
        double totalPago = 0;

        for (Veiculo15 veiculo : veiculos) {
            totalPago += veiculo.calcularValorPago();
        }

        return totalPago;
    }
}
