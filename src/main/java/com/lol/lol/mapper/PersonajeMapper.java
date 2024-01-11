package com.lol.lol.mapper;

import com.lol.lol.controller.model.personaje.PersonajeDetailWeb;
import com.lol.lol.controller.model.personaje.PersonajeListWeb;
import com.lol.lol.domain.entity.Personaje;
import com.lol.lol.persistance.model.PersonajeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonajeMapper {
    PersonajeMapper mapper = Mappers.getMapper(PersonajeMapper.class);

    List<Personaje> toPersonajeList(List<PersonajeEntity> personajeEntities);

    PersonajeListWeb toPersonajeListWeb(Personaje personaje);

    PersonajeDetailWeb toPersonajeDetailWeb(Personaje personaje);
}
