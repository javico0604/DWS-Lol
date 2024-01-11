package com.lol.lol.persistance.dao;

import com.lol.lol.domain.entity.Personaje;
import com.lol.lol.persistance.model.PersonajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonajeDAO extends JpaRepository<PersonajeEntity, Integer> {

}
