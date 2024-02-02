package com.lol.lol.controller.model.personaje;

import com.lol.lol.controller.model.habilidad.HabilidadCreateWeb;
import com.lol.lol.validation.habilidad.ValidTecla;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PersonajeCreateWeb {
     private String nombre;
     private String genero;
     private String recurso;
     private String alcance;
     private int anyo;
     private List<Integer> posicionList;
     private List<HabilidadCreateWeb> habilidadCreateWebs;
}
