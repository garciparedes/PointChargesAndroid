package com.cargaspuntuales.model;

/**
 * Created by oscar on 21/04/15.
 */
public class Carga {
    private point3d coordenadas;
    private double carga;

    public Carga(point3d p, double carga){
        coordenadas = p;
        this.carga = carga;

    }

    public Carga(double x, double y, double z, double carga){
        coordenadas = new point3d(x,y,z);
        this.carga=carga;
    }

    public double getCarga() {
        return carga;
    }

    public point3d getCoordenadas() {
        return coordenadas;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void setCoordenadas(point3d coordenadas) {
        this.coordenadas = coordenadas;
    }
}
