package com.lol.lol.persistance.impl;

import com.lol.lol.domain.entity.Posicion;
import com.lol.lol.domain.repository.PosicionRepository;
import com.lol.lol.mapper.PosicionMapper;
import com.lol.lol.persistance.dao.PosicionDAO;
import com.lol.lol.persistance.model.PosicionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PosicionRepositoryImpl implements PosicionRepository {

    @Autowired
    PosicionDAO posicionDAO;

    @Override
    public List<Posicion> findByPersonajeId(int id) {
        List<PosicionEntity> posicionEntity = posicionDAO.findByPersonajeId(id);
        List<Posicion> posicion = PosicionMapper.mapper.toPosicion(posicionEntity);
        return posicion;
    }

    @Override
    public Optional<Posicion> findById(int id){
        return Optional.ofNullable(PosicionMapper.mapper.toPosicion(posicionDAO.findById(id).orElse(null)));
    }
}
