package com.mycompany.reto_7;

public class metodosTramos implements tramoGenerico {
    boolean esAsfalto;
    String coordenadasIniciales;
    String coordenadasFinales;
    public double x1;
    double x2;
    double y1;
    double y2;
    double ancho;
    double grosor;

    public metodosTramos() {
    }

    
    public metodosTramos(boolean esAsfalto, String coordenadasIniciales, String coordenadasFinales, double ancho, double grosor) {
        this.esAsfalto = esAsfalto;
        this.coordenadasIniciales = coordenadasIniciales;
        this.coordenadasFinales = coordenadasFinales;
        this.ancho = ancho;
        this.grosor = grosor;
    }

    @Override
    public double longitud() {
        return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 1));
    }

    @Override
    public double area() {
        return longitud()*ancho;
    }

    @Override
    public double volumen() {
        return area()*grosor;
    }

    @Override
    public boolean esAsfaltada() {
        return esAsfalto;
    }

    @Override
    public String getCoordenadasIniciales() {
        return coordenadasIniciales;
    }

    @Override
    public String getCoordenadasFinales() {
        return coordenadasFinales;
    }

    @Override
    public void stringToDouble() {
        String[] vectorAux = coordenadasIniciales.split(";");
        x1 = Double.parseDouble(vectorAux[0]);
        y1 = Double.parseDouble(vectorAux[1]);
        vectorAux = coordenadasFinales.split(";");
        x2 = Double.parseDouble(vectorAux[0]);
        y2 = Double.parseDouble(vectorAux[1]);
    }


}