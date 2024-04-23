package br.edu.up.modelos;

public class Pessoa11 {
    private String nome;
    private char sexo;

    public Pessoa11(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public static void contarSexo(Pessoa11[] pessoas) {
        int totalHomens = 0;
        int totalMulheres = 0;

        for (Pessoa11 pessoa : pessoas) {
            if (pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm') {
                totalHomens++;
                System.out.println("Nome: " + pessoa.nome + " - Sexo: Homem");
            } else if (pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f') {
                totalMulheres++;
                System.out.println("Nome: " + pessoa.nome + " - Sexo: Mulher");
            }
        }

        System.out.println("Total de Homens: " + totalHomens);
        System.out.println("Total de Mulheres: " + totalMulheres);
    }
}
