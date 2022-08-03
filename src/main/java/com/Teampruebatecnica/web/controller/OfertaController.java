package com.Teampruebatecnica.web.controller;

import com.Teampruebatecnica.domain.service.OfertaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.Teampruebatecnica.persistence.entity.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/ofertas")
public class OfertaController {
    @Autowired
    private OfertaService ofertaService;

    @GetMapping("")
    public List<Oferta> getAll(){
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
