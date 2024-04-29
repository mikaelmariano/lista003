package br.edu.up.modelos;

public class Vendedor03 {
    private String nome;
    private double salarioFixo;
    private double totalVendas;

    // Construtor para inicializar os atributos
    public Vendedor03(String nParam, double sfParam, double tvParam) {
        nome = nParam;
        salarioFixo = sfParam;
        totalVendas = tvParam;
    }

    // getters para acessar os campos privados
    public String getNome() {
        return nome;
    }
    
    public double getSalarioFixo() {
        return salarioFixo;
    }

    // Método para calcular o salário final do vendedor
    public double calcularSalarioFinal() {
        double comissao = totalVendas * 0.15;
        return salarioFixo + comissao;
    }
}
