package br.edu.up.modelos;

public class Compra05 {

    private double valorCompra;

    public Compra05(double vcParam){
        valorCompra = vcParam;
    }
   

    // getters para acessar os campos privados
    public double getValorCompra() {
        return valorCompra;
    }
    
        // Método para calcular e retornar o valor de cada prestação
    public double calcularPrestacoes() {
        return valorCompra / 5;
        }
}
    
