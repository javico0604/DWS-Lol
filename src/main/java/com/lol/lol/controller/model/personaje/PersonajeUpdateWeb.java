package com.lol.lol.controller.model.personaje;

import com.lol.lol.controller.model.habilidad.HabilidadCreateWeb;
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
public class PersonajeUpdateWeb {
    private int id;
    private String nombre;
    private String genero;
    private String recurso;
    private String alcance;
    @NotNull
    @Min(value = 2009, message = "El año debe ser posterior a 2009")
    private int anyo;
    @NotEmpty
    @Size(min = 1, max = 5, message = "Tiene que tener al menos una posicion o maximo 5")
    private List<Integer> posicionList;
    @NotEmpty
    @Size(min = 4, max = 4, message = "Tienen que haber 4 habilidades")
    private List<HabilidadCreateWeb> habilidadCreateWebs;
}
