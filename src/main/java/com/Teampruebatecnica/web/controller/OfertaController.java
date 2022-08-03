package com.Teampruebatecnica.web.controller;

import com.Teampruebatecnica.domain.service.OfertaService;
import com.Teampruebatecnica.persistence.entity.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ofertas")
public class OfertaController {
    @Autowired
    private OfertaService ofertaService;

    @GetMapping("")
    public List<Oferta> getAll(){
        System.out.println("Entro service");
        return ofertaService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Oferta> getOferta(@PathVariable("id") long id){
        return ofertaService.getOferta(id);
    }
    @PostMapping()
    public Oferta postOferta(@RequestBody Oferta nuevaOferta){
        return ofertaService.postOferta(nuevaOferta);
    }
    @DeleteMapping("/{id}")
    public boolean deleteOferta(@PathVariable long id){
        return ofertaService.deleteOferta(id);
    }

}
