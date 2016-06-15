package com.geekearte.creacional.prototype.ejemplo.tv;

/**
 * Created by rodrigo on 6/14/16.
 */
public class Plasma extends TV {

    private double anguloVision;
    private double tiempoRespuesta;

    public Plasma(String marca, int pulgadas, String color, double precio, double anguloVision, double tiempoRespuesta) {
        super(marca, pulgadas, color, precio);
        this.anguloVision = anguloVision;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public double getAnguloVision() {
        return anguloVision;
    }

    public void setAnguloVision(double anguloVision) {
        this.anguloVision = anguloVision;
    }

    public double getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(double tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }
}
