package com.lol.lol.domain.repository;

import com.lol.lol.domain.entity.Habilidad;

import java.util.List;

public interface HabilidadRepository {
    List<Habilidad> findByPersonajeId(int id);
}
