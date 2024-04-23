package br.edu.up.modelos;

public class Funcionario18 {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Funcionario18(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public double calcularAbono() {
        double abono;

        // Calcula o abono de acordo com o sexo e a idade
        if (sexo == 'M') {
            abono = (idade >= 30) ? 100.00 : 50.00;
        } else { // sexo == 'F'
            abono = (idade >= 30) ? 200.00 : 80.00;
        }

        return abono;
    }

    public double calcularSalarioLiquido() {
        double abono = calcularAbono();
        return salarioFixo + abono;
    }

    public void mostrarInformacoes() {
        double salarioLiquido = calcularSalarioLiquido();
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
