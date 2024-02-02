package com.lol.lol.domain.repository;

import com.lol.lol.domain.entity.Habilidad;
import com.lol.lol.domain.entity.Personaje;
import com.lol.lol.persistance.model.HabilidadEntity;

import java.util.List;
import java.util.Optional;

public interface PersonajeRepository {
    List<Personaje> getAll();
    Optional<Personaje> find(int id);
    void update(Personaje personaje);
    List<Personaje> findByHabilidadId(int habilidadId);
    void delete(int id);

    long getTotalNumberOfRecords();

    int create(Personaje personaje);

}
