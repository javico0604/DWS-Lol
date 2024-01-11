package com.lol.lol.persistance.impl;

import com.lol.lol.domain.entity.Posicion;
import com.lol.lol.domain.repository.PosicionRepository;
import com.lol.lol.mapper.PosicionMapper;
import com.lol.lol.persistance.dao.PosicionDAO;
import com.lol.lol.persistance.model.PosicionEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class PosicionRepositoryImpl implements PosicionRepository {

    @Autowired
    PosicionDAO posicionDAO;

    @Override
    public Posicion findByPersonajeId(int id) {
        PosicionEntity posicionEntity = posicionDAO.findByPersonajeId(id);
        Posicion posicion = PosicionMapper.mapper.toPosicion(posicionEntity);
        return posicion;
    }
}
