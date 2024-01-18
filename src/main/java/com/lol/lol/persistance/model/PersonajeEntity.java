package com.lol.lol.persistance.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "personajes")
@Data
public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String genero;
    private String recurso;
    private String alcance;
    private int anyo;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "personaje_id")
    private List<HabilidadEntity> habilidadEntities;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "personajes_posiciones",
            joinColumns = @JoinColumn(name = "personaje_id"),
            inverseJoinColumns = @JoinColumn(name = "posicion_id"))
    private List<PosicionEntity> posicionEntities;
}
