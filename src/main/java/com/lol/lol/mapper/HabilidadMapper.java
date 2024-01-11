package com.lol.lol.mapper;

import com.lol.lol.controller.model.habilidad.HabilidadesListWeb;
import com.lol.lol.domain.entity.Habilidad;
import com.lol.lol.persistance.model.HabilidadEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HabilidadMapper {
    HabilidadMapper mapper = Mappers.getMapper(HabilidadMapper.class);

    List<Habilidad> toHabilidad(List<HabilidadEntity> habilidadEntity);

    List<HabilidadesListWeb> toHabilidadListWeb(List<Habilidad> habilidadList);
}
