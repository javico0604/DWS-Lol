package com.lol.lol.domain.service;

import com.lol.lol.domain.entity.Personaje;

import java.util.List;

public interface PersonajeService {
    List<Personaje> getAll();

    long getTotalNumberOfRecords();

    Personaje find(int id);
}
