package br.edu.up.modelos;

public class Pessoa13 {
    private String nome;
    private char sexo;
    private int idade;
    private boolean saude;

    public Pessoa13(String nome, char sexo, int idade, boolean saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean estaAptaServicoMilitar() {
        return (idade >= 18 && idade <= 25 && saude);
    }

    public static void contarAptos(Pessoa13[] pessoas) {
        int totalAptos = 0;
        int totalInaptos = 0;

        for (Pessoa13 pessoa : pessoas) {
            if (pessoa.estaAptaServicoMilitar()) {
                System.out.println("Nome: " + pessoa.nome + pessoa.sexo + " - Apto para o serviço militar obrigatório");
                totalAptos++;
            } else {
                System.out.println("Nome: " + pessoa.nome + pessoa.sexo + " - Inapto para o serviço militar obrigatório");
                totalInaptos++;
            }
        }

        System.out.println("Total de aptos: " + totalAptos);
        System.out.println("Total de inaptos: " + totalInaptos);
    }
}
