package com.lol.lol.persistance.impl;

import com.lol.lol.domain.entity.Personaje;
import com.lol.lol.domain.repository.PersonajeRepository;
import com.lol.lol.mapper.PersonajeMapper;
import com.lol.lol.persistance.dao.HabilidadDAO;
import com.lol.lol.persistance.dao.PersonajeDAO;
import com.lol.lol.persistance.model.PersonajeEntity;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonajeRepositoryImpl implements PersonajeRepository {

    private final PersonajeDAO personajeDAO;
    private final HabilidadDAO habilidadDAO;

    @Autowired
    public PersonajeRepositoryImpl(PersonajeDAO personajeDAO, HabilidadDAO habilidadDAO) {
        this.personajeDAO = personajeDAO;
        this.habilidadDAO = habilidadDAO;
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
    public Optional<Personaje> find(int id) {
        PersonajeEntity personajeEntity = personajeDAO.findById(id).orElse(null);
        if(personajeEntity == null){
            return Optional.empty();
        }
        return Optional.of(PersonajeMapper.mapper.toPersonaje(personajeEntity));
    }

    @Override
    public int insert(Personaje personajes) {
        return 0;
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
