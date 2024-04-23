package br.edu.up.modelos;

public class Produto14 {
    private double precoCusto;
    private double precoVenda;

    public Produto14(double precoCusto, double precoVenda) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public void calcularLucroPrejuizoEmpate() {
        if (precoVenda > precoCusto) {
            System.out.println("Lucro: O produto teve lucro.");
        } else if (precoVenda < precoCusto) {
            System.out.println("Prejuízo: O produto teve prejuízo.");
        } else {
            System.out.println("Empate: O produto não teve lucro nem prejuízo.");
        }
    }

    public static void calcularMedias(Produto14[] produtos) {
        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        for (Produto14 produto : produtos) {
            somaPrecoCusto += produto.precoCusto;
            somaPrecoVenda += produto.precoVenda;
        }

        double mediaPrecoCusto = somaPrecoCusto / produtos.length;
        double mediaPrecoVenda = somaPrecoVenda / produtos.length;

        System.out.println("Média de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);
    }
}
