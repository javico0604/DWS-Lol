package com.lol.lol.mapper;

import com.lol.lol.controller.model.posicion.PosicionListWeb;
import com.lol.lol.domain.entity.Posicion;
import com.lol.lol.persistance.model.PosicionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PosicionMapper {
    PosicionMapper mapper = Mappers.getMapper(PosicionMapper.class);

    List<Posicion> toPosicion(List<PosicionEntity> posicionEntity);

    List<PosicionListWeb> toPosicionListWeb(List<Posicion> posicionList);
}
