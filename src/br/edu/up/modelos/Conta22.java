package br.edu.up.modelos;

public class Conta22 {
    private double valorKWh;
    private int tipoCliente;
    private int quantidadeKWh;

    public Conta22(int tipoCliente, int quantidadeKWh) {
        this.tipoCliente = tipoCliente;
        this.quantidadeKWh = quantidadeKWh;
        definirValorKWh();
    }

    private void definirValorKWh() {
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.602;
                break;
            case 2:
                valorKWh = 0.483;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
        }
    }

    public double calcularValorConta() {
        return valorKWh * quantidadeKWh;
    }
}
