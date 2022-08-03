package com.Teampruebatecnica.web.controller;

import com.Teampruebatecnica.domain.service.OfertaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.Teampruebatecnica.persistence.entity.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Notacion con el fin de indicar que la clase es un Rest
@RestController
//Configurar los Cors
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
//Ruta que va a tomar para acceder a la clase con los servicios
@RequestMapping("/ofertas")
public class OfertaController {
    //Injeccion usando OfertaSevice
    @Autowired
    private OfertaService ofertaService;

    //Servicio usando el GetMappting para obtener todas las ofertas
    @GetMapping("")
    public List<Oferta> getAll(){
        return ofertaService.getAll();
    }
    //Servicio usando el GetMappting para obtener la oferta apartir del ID
    @GetMapping("/{id}")
    public Optional<Oferta> getOferta(@PathVariable("id") long id){
        return ofertaService.getOferta(id);
    }
    //Servicio usando el PostMapping para agregar una nueva oferta
    @PostMapping()
    public Oferta postOferta(@RequestBody Oferta nuevaOferta){
        return ofertaService.postOferta(nuevaOferta);
    }
    //Servicio usando el PutMapping para actualizar una oferta
    @PutMapping()
    public boolean putOferta(@RequestBody Oferta ofertActualizada){
        return ofertaService.updateOferta(ofertActualizada);
    }
    //Servicio usando el DeleteMapping para eliminar una oferta según el ID
    @DeleteMapping("/{id}")
    public boolean deleteOferta(@PathVariable long id){
        return ofertaService.deleteOferta(id);
    }

}
