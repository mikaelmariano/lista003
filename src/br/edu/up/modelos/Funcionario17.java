package br.edu.up.modelos;

public class Funcionario17 {
    private String nome;
    private double salario;
    private double salarioMinimo;

    public Funcionario17(String nome, double salario, double salarioMinimo) {
        this.nome = nome;
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
    }

    public double calcularReajuste() {
        double novoSalario;

        // Reajuste de acordo com o salário
        if (salario < 3 * salarioMinimo) {
            novoSalario = salario * 1.5; // Aumento de 50%
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            novoSalario = salario * 1.2; // Aumento de 20%
        } else {
            novoSalario = salario * 1.15; // Aumento de 15%
        }

        return novoSalario;
    }

    public void mostrarInformacoes(double novoSalario) {
        double aumento = novoSalario - salario;
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Reajuste: " + aumento);
        System.out.println("Novo salário: " + novoSalario);
    }

    public static double calcularAumentoFolhaPagamento(Funcionario17[] funcionarios) {
        double aumentoTotal = 0;

        for (Funcionario17 funcionario : funcionarios) {
            double novoSalario = funcionario.calcularReajuste();
            aumentoTotal += (novoSalario - funcionario.salario);
        }

        return aumentoTotal;
    }
}
