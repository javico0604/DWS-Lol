package com.lol.lol.persistance.dao;

import com.lol.lol.persistance.model.HabilidadEntity;
import com.lol.lol.persistance.model.PersonajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabilidadDAO extends JpaRepository<HabilidadEntity, Integer> {

    @Query(value = "select * from habilidades where personaje_id = :personajeId", nativeQuery = true)
    List<HabilidadEntity> findByPersonajeId(@Param("personajeId") int id);
}
