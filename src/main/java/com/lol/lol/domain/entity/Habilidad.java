package com.lol.lol.domain.entity;

import com.lol.lol.validation.habilidad.ValidTecla;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Habilidad {
    private int id;
    private String nombre;
    @ValidTecla
    private String tecla;
    private int personajeId;

    public Habilidad(int id, String nombre, String tecla, int personajeId) {
        this.id = id;
        this.nombre = nombre;
        this.tecla = tecla;
        this.personajeId = personajeId;
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

    public String getTecla() {
        return tecla;
    }

    public void setTecla(String tecla) {
        this.tecla = tecla;
    }

    public int getPersonajeId() {
        return personajeId;
    }

    public void setPersonajeId(int personajeId) {
        this.personajeId = personajeId;
    }

    @Override
    public String toString() {
        return "Habilidades{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tecla='" + tecla + '\'' +
                ", personajeId=" + personajeId +
                '}';
    }
}
