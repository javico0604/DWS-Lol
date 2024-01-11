package com.lol.lol.persistance.dao;

import com.lol.lol.domain.entity.Posicion;
import com.lol.lol.persistance.model.PersonajeEntity;
import com.lol.lol.persistance.model.PosicionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PosicionDAO extends JpaRepository<PosicionEntity, Integer> {
    @Query(value = "select * from personajes_posiciones where personaje_id = :personajeId", nativeQuery = true)
    PosicionEntity findByPersonajeId(@Param("personajeId") int personajeId);
}
