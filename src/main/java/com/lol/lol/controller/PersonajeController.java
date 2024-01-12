package com.lol.lol.controller;

import com.lol.lol.controller.model.personaje.PersonajeCreateWeb;
import com.lol.lol.controller.model.personaje.PersonajeDetailWeb;
import com.lol.lol.controller.model.personaje.PersonajeListWeb;
import com.lol.lol.domain.entity.Personaje;
import com.lol.lol.domain.service.PersonajeService;
import com.lol.lol.http_response.Response;
import com.lol.lol.mapper.PersonajeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/personajes")
@RestController
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public Response getAll(){
        List<Personaje> personajes = personajeService.getAll();
        List<PersonajeListWeb> personajeListWebs = personajes.stream()
                .map(personaje -> PersonajeMapper.mapper.toPersonajeListWeb(personaje))
                .toList();
        long totalRecords = personajeService.getTotalNumberOfRecords();
        Response response = new Response(personajeListWebs, totalRecords);
        return response;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Response find(@PathVariable("id") int id){
        Personaje personaje = personajeService.find(id);
        PersonajeDetailWeb personajeDetailWeb = PersonajeMapper.mapper.toPersonajeDetailWeb(personaje);
        personajeDetailWeb.setPosicionListWebList(personaje.getPosicion().stream().map(posicion -> posicion.getPosicion()).toList());

        Response response = new Response(personajeDetailWeb);
        return response;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Response create(@RequestBody PersonajeCreateWeb personajeCreateWeb){
        int id = personajeService.create(PersonajeMapper.mapper.toPersonaje(personajeCreateWeb), personajeCreateWeb.getPosicionList());
        PersonajeListWeb personajeListWeb = new PersonajeListWeb();
        personajeListWeb.setId(id);
        personajeListWeb.setNombre(personajeCreateWeb.getNombre());
        return new Response(personajeListWeb);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        personajeService.delete(id);
    }
}
