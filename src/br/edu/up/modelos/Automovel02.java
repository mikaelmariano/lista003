package br.edu.up.modelos;


public class Automovel02 {
    private double distanciaPercorrida;
    private double combustivelGasto;

    
    public Automovel02(double distanciaPercorrida, double combustivelGasto) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    
    public double calcularConsumoMedio() {
        return distanciaPercorrida / combustivelGasto;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }
}
