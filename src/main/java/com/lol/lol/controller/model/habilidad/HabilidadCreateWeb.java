package com.lol.lol.controller.model.habilidad;

import com.lol.lol.validation.habilidad.ValidTecla;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class HabilidadCreateWeb {
    private String nombre;
    @ValidTecla
    private String tecla;
}
