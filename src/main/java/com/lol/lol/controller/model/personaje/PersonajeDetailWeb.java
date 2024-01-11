package com.lol.lol.controller.model.personaje;

import com.lol.lol.controller.model.habilidad.HabilidadesListWeb;
import com.lol.lol.controller.model.posicion.PosicionListWeb;
import com.lol.lol.domain.entity.Posicion;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PersonajeDetailWeb {
    private int id;
    private String nombre;
    private String genero;
    private String recurso;
    private String alcance;
    private List<String> posicionListWebList;
    private List<HabilidadesListWeb> habilidadesListWebList;
}
