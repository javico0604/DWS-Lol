package com.lol.lol.persistance.impl;

import com.lol.lol.domain.entity.Habilidad;
import com.lol.lol.domain.entity.Personaje;
import com.lol.lol.domain.repository.PersonajeRepository;
import com.lol.lol.mapper.HabilidadMapper;
import com.lol.lol.mapper.PersonajeMapper;
import com.lol.lol.persistance.dao.HabilidadDAO;
import com.lol.lol.persistance.dao.PersonajeDAO;
import com.lol.lol.persistance.dao.PosicionDAO;
import com.lol.lol.persistance.model.HabilidadEntity;
import com.lol.lol.persistance.model.PersonajeEntity;
import jakarta.transaction.Transactional;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonajeRepositoryImpl implements PersonajeRepository {

    private final PersonajeDAO personajeDAO;
    private final HabilidadDAO habilidadDAO;

    private final PosicionDAO posicionDAO;

    @Autowired
    public PersonajeRepositoryImpl(PersonajeDAO personajeDAO, HabilidadDAO habilidadDAO, PosicionDAO posicionDAO) {
        this.personajeDAO = personajeDAO;
        this.habilidadDAO = habilidadDAO;
        this.posicionDAO = posicionDAO;
    }
    @Override
    public List<Personaje> getAll() {
        List<PersonajeEntity> personajesEntities;
        personajesEntities = personajeDAO.findAll();

        return PersonajeMapper.mapper.toPersonajeList(personajesEntities);
    }

    @Override
    public long getTotalNumberOfRecords() {
        return personajeDAO.count();
    }

    @Override
    @Transactional
    public int create(Personaje personaje, List<Habilidad> habilidadList) {
        System.out.println(PersonajeMapper.mapper.toPersonajeEntity(personaje));
        PersonajeEntity personajeEntity = personajeDAO.save(PersonajeMapper.mapper.toPersonajeEntity(personaje));
        List<HabilidadEntity> habilidadEntityList = HabilidadMapper.mapper.toHabilidadEntity(habilidadList);
        personajeEntity.getPosicionEntities().forEach(posicionEntity -> posicionDAO.save(posicionEntity));
        habilidadEntityList.forEach(habilidadEntity ->
                {habilidadEntity.setPersonajeEntity(personajeEntity);
                habilidadDAO.save(habilidadEntity);
            });
        return personajeEntity.getId();
    }

    @Override
    public Optional<Personaje> find(int id) {
        PersonajeEntity personajeEntity = personajeDAO.findById(id).orElse(null);
        if(personajeEntity == null){
            return Optional.empty();
        }
        return Optional.of(PersonajeMapper.mapper.toPersonaje(personajeEntity));
    }


    @Override
    public void update(Personaje personaje) {

    }

    @Override
    public List<Personaje> findByHabilidadId(int habilidadId) {
        return null;
    }

    @Override
    @Transactional
    public void delete(Personaje personaje) {
        personajeDAO.delete(PersonajeMapper.mapper.toPersonajeEntity(personaje));
    }
}
