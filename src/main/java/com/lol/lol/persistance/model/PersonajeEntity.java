package com.lol.lol.persistance.model;

import jakarta.persistence.*;
import lombok.*;

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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "personaje_posicion")
    private PosicionEntity posicionEntity;
}
