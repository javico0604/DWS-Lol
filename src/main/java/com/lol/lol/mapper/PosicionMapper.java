package com.lol.lol.mapper;

import com.lol.lol.domain.entity.Posicion;
import com.lol.lol.persistance.model.PosicionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PosicionMapper {
    PosicionMapper mapper = Mappers.getMapper(PosicionMapper.class);

    Posicion toPosicion(PosicionEntity posicionEntity);
}
