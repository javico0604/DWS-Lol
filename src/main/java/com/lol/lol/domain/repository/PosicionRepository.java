package com.lol.lol.domain.repository;

import com.lol.lol.domain.entity.Posicion;

import java.util.List;
import java.util.Optional;

public interface PosicionRepository {
    List<Posicion> findByPersonajeId(int id);

    Optional<Posicion> findById(int id);
}
