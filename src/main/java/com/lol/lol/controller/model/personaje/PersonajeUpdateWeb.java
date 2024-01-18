package com.lol.lol.controller.model.personaje;

import com.lol.lol.controller.model.habilidad.HabilidadCreateWeb;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PersonajeUpdateWeb {
    private int id;
    private String nombre;
    private String genero;
    private String recurso;
    private String alcance;
    private int anyo;
    private List<Integer> posicionList;
    private List<HabilidadCreateWeb> habilidadCreateWebs;
}
