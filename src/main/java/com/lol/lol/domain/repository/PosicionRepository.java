package com.lol.lol.domain.repository;

import com.lol.lol.domain.entity.Posicion;

import java.util.List;

public interface PosicionRepository {
    List<Posicion> findByPersonajeId(int id);

    Posicion findById(int id);
}
