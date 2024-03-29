package com.lol.lol.domain.entity;

import jakarta.validation.ValidationException;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Personaje {
    private int id;
    @NotNull
    private String nombre;
    @NotNull
    private String genero;
    @NotNull
    private String recurso;
    @NotNull
    private String alcance;
    @NotNull
    @Min(value = 2009, message = "El año debe ser posterior a 2009")
    private int anyo;
    @NotEmpty
    @Size(min = 1, max = 5, message = "Tiene que tener al menos una posicion o maximo 5")
    private List<Posicion> posicion;
    @NotEmpty
    @Size(min = 4, max = 4, message = "Tienen que haber 4 habilidades")
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

    public void setPosicion(Posicion posicion) {
        if(this.posicion == null) {
            this.posicion =  new ArrayList<>();
        }
        this.posicion.add(posicion);
    }


    public List<Habilidad> getHabilidadList() {
        return habilidadList;
    }

    public void setHabilidadList(List<Habilidad> habilidadList) {
        this.habilidadList = habilidadList;
    }

    public void setHabilidad(Habilidad habilidad) {
        if(habilidadList == null) {
            habilidadList = new ArrayList<>();
        }
        habilidadList.forEach(h -> {
            if(Objects.equals(h.getTecla(), habilidad.getTecla())){
                throw new ValidationException("No se puede repetir la tecla");
            }
        });
        habilidadList.add(habilidad);
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
