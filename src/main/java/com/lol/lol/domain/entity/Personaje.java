package com.lol.lol.domain.entity;

import java.util.List;

public class Personaje {
    private int id;
    private String nombre;
    private String genero;
    private String recurso;
    private String alcance;
    private int anyo;
    private List<Posicion> posicion;
    private List<Habilidad> habilidadList;

    public Personaje(int id, String nombre, String genero, String recurso, String alcance, int anyo, List<Posicion> posicion, List<Habilidad> habilidadList) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.recurso = recurso;
        this.alcance = alcance;
        this.anyo = anyo;
        this.posicion = posicion;
        this.habilidadList = habilidadList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public List<Posicion> getPosicion() {
        return posicion;
    }

    public void setPosicion(List<Posicion> posicion) {
        this.posicion = posicion;
    }

    public List<Habilidad> getHabilidadList() {
        return habilidadList;
    }

    public void setHabilidadList(List<Habilidad> habilidadList) {
        this.habilidadList = habilidadList;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", recurso='" + recurso + '\'' +
                ", alcance='" + alcance + '\'' +
                ", anyo=" + anyo +
                ", posicion='" + posicion + '\'' +
                ", habilidadList=" + habilidadList +
                '}';
    }
}
