package com.lol.lol.domain.repository;

import com.lol.lol.domain.entity.Posicion;

public interface PosicionRepository {
    Posicion findByPersonajeId(int id);
}
