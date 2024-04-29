package br.edu.up.modelos;

public class Seguradora26 {
    //private String nome;
    private int idade;
    private String grupoRisco;

    public Seguradora26(String nome, int idade, String grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String determinarCategoriaSeguro() {
        if (idade < 17 || idade > 70) {
            return "Não se enquadra em nenhuma categoria de seguro.";
        }

        if (idade >= 17 && idade <= 20) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                return "Categoria 1";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                return "Categoria 2";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                return "Categoria 3";
            }
        } else if (idade >= 21 && idade <= 24) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                return "Categoria 2";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                return "Categoria 3";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                return "Categoria 4";
            }
        } else if (idade >= 25 && idade <= 34) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                return "Categoria 3";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                return "Categoria 4";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                return "Categoria 5";
            }
        } else if (idade >= 35 && idade <= 64) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                return "Categoria 4";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                return "Categoria 5";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                return "Categoria 6";
            }
        } else if (idade >= 65 && idade <= 70) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                return "Categoria 7";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                return "Categoria 8";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                return "Categoria 9";
            }
        }

        return "Não se enquadra em nenhuma categoria de seguro." ;
    }
}
