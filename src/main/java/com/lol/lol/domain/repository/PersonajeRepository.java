package com.lol.lol.domain.repository;

import com.lol.lol.domain.entity.Personaje;

import java.util.List;
import java.util.Optional;

public interface PersonajeRepository {
    List<Personaje> getAll();
    Optional<Personaje> find(int id);
    int insert(Personaje personajes);
    void update(Personaje personaje);
    List<Personaje> findByHabilidadId(int habilidadId);
    void delete(Personaje personaje);

    long getTotalNumberOfRecords();
}
