package com.lol.lol.domain.service.impl;

import com.lol.lol.controller.model.habilidad.HabilidadCreateWeb;
import com.lol.lol.domain.entity.Habilidad;
import com.lol.lol.domain.entity.Personaje;
import com.lol.lol.domain.entity.Posicion;
import com.lol.lol.domain.repository.HabilidadRepository;
import com.lol.lol.domain.repository.PersonajeRepository;
import com.lol.lol.domain.repository.PosicionRepository;
import com.lol.lol.domain.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.lol.lol.validation.Validation.validate;

@Service
public class PersonajesServiceImpl implements PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    @Autowired
    private PosicionRepository posicionRepository;

    @Autowired
    private HabilidadRepository habilidadRepository;

    @Override
    public List<Personaje> getAll() {
        return personajeRepository.getAll();
    }
    @Override
    public long getTotalNumberOfRecords() {
        return personajeRepository.getTotalNumberOfRecords();
    }

    @Override
    public Personaje find(int id){
        Personaje personaje = personajeRepository.find(id).orElseThrow();

        List<Posicion> posicionList = posicionRepository.findByPersonajeId(id);
        personaje.setPosicion(posicionList);

        List<Habilidad> habilidadList = habilidadRepository.findByPersonajeId(id);
        personaje.setHabilidadList(habilidadList);

        return personaje;
    }

    @Override
    public void delete(int id){
        personajeRepository.delete(id);
    }

    @Override
    public int create(Personaje personaje, List<Integer> posicionWebList, List<Habilidad> habilidadList) {
        posicionWebList.forEach(
                p -> personaje.setPosicion(posicionRepository.findById(p).orElse(null))
        );
        habilidadList.forEach(h->{
                    validate(h);
                    personaje.setHabilidad(h);
                }
        );
        validate(personaje);
        return personajeRepository.create(personaje);
    }

    @Override
    public void update(Personaje personaje, List<Integer> posicionWebList, List<Habilidad> habilidadList) {
        posicionWebList.forEach(
                p -> personaje.setPosicion(posicionRepository.findById(p).orElse(null)));
        habilidadList.forEach(h->{
                    validate(h);
                    personaje.setHabilidad(h);
                }
        );
        validate(personaje);
        personajeRepository.update(personaje);
    }

}
