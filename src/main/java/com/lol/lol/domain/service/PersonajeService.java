package com.lol.lol.domain.service;

import com.lol.lol.controller.model.habilidad.HabilidadCreateWeb;
import com.lol.lol.domain.entity.Habilidad;
import com.lol.lol.domain.entity.Personaje;

import java.util.List;

public interface PersonajeService {
    List<Personaje> getAll();

    long getTotalNumberOfRecords();

    Personaje find(int id);

    void delete(int id);

    int create(Personaje personaje, List<Integer> posicionList, List<Habilidad> habilidadList);

    void update(Personaje personaje, List<Integer> posicionList, List<Habilidad> habilidadList);
}
