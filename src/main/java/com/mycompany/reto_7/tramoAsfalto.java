package com.mycompany.reto_7;

public class tramoAsfalto extends metodosTramos {
    String nombreProveedor;
    double velocidadMaxima;
    boolean permitirAdelantamiento;

    public tramoAsfalto(String nombreProveedor, double velocidadMaxima, boolean permitirAdelantamiento, boolean esAsfalto, String coordenadasIniciales, String coordenadasFinales, double ancho, double grosor) {
        super(esAsfalto, coordenadasIniciales, coordenadasFinales, ancho, grosor);
        this.nombreProveedor = nombreProveedor;
        this.velocidadMaxima = velocidadMaxima;
        this.permitirAdelantamiento = permitirAdelantamiento;
    }


    @Override
    public String toString() {
        return "tramoAsfalto{" + "nombreProveedor=" + nombreProveedor + ", velocidadMaxima=" + velocidadMaxima + ", permitirAdelantamiento=" + permitirAdelantamiento + ", coordenadasIniciales=" + coordenadasIniciales + ", coordenadasFinales=" + coordenadasFinales + ", x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + '}';
    }

    

}
