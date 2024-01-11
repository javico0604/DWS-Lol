package com.lol.lol.persistance.dao;

import com.lol.lol.domain.entity.Posicion;
import com.lol.lol.persistance.model.PersonajeEntity;
import com.lol.lol.persistance.model.PosicionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PosicionDAO extends JpaRepository<PosicionEntity, Integer> {
    @Query(value = "select p.* from posiciones p join personajes_posiciones pp on p.id = pp.posicion_id where pp.personaje_id = :personajeId", nativeQuery = true)
    List<PosicionEntity> findByPersonajeId(@Param("personajeId") int personajeId);
}
