package com.lol.lol.controller.model.personaje;

import com.lol.lol.controller.model.habilidad.HabilidadesListWeb;
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
    private String posicion;
    private List<HabilidadesListWeb> habilidadesListWebList;
}
