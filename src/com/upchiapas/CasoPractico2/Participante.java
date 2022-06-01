package com.upchiapas.CasoPractico2;

import java.util.Random;

public class Participante{ //clase principal
    private int folio;
    private String nombre;  // atributos
    private String lugarRepresenta;

    public Participante(int folio, String nombre, String lugarRepresenta) { //constructor con parametros
        this.folio = folio;
        this.nombre = nombre;
        this.lugarRepresenta = lugarRepresenta;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarRepresenta() {
        return lugarRepresenta;
    }

    public void setLugarRepresenta(String lugarRepresenta) {
        this.lugarRepresenta = lugarRepresenta;
    }

    @Override
    public String toString() {
        return "Participante " +
                "folio = " + folio +
                ", nombre ='" + nombre + '\'' +
                ", lugar que representa ='" + lugarRepresenta + '\'';
    }


}
