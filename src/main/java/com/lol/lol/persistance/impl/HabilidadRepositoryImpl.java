package com.lol.lol.persistance.impl;

import com.lol.lol.domain.entity.Habilidad;
import com.lol.lol.domain.repository.HabilidadRepository;
import com.lol.lol.mapper.HabilidadMapper;
import com.lol.lol.persistance.dao.HabilidadDAO;
import com.lol.lol.persistance.model.HabilidadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HabilidadRepositoryImpl implements HabilidadRepository {

    @Autowired
    HabilidadDAO habilidadDAO;

    @Override
    public List<Habilidad> findByPersonajeId(int id) {
        List<HabilidadEntity> habilidadEntities = habilidadDAO.findByPersonajeId(id);
        List<Habilidad> habilidadList = HabilidadMapper.mapper.toHabilidad(habilidadEntities);
        return habilidadList;
    }
}
