package com.mycompany.reto_7;

 public class tramoSinAsfaltar extends metodosTramos {
    String tipoMaterial;

    public tramoSinAsfaltar(String tipoMaterial, boolean esAsfalto, String coordenadasIniciales, String coordenadasFinales, double ancho, double grosor) {
        super(esAsfalto, coordenadasIniciales, coordenadasFinales, ancho, grosor);
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public String toString() {
        return "tramoSinAsfaltar{" + "tipoMaterial=" + tipoMaterial +  ", coordenadasIniciales=" + coordenadasIniciales + ", coordenadasFinales=" + coordenadasFinales + ", x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + '}';
    }

}
