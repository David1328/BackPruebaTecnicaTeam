package com.Teampruebatecnica.domain.service;

import com.Teampruebatecnica.domain.repository.OfertRepository;
import com.Teampruebatecnica.persistence.entity.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfertaService {
    @Autowired
    private OfertRepository ofertRepository;

    public List<Oferta> getAll(){
        return ofertRepository.getAll();
    }
    public Optional<Oferta> getOferta(long id){
        return ofertRepository.getById(id);
    }
    public Oferta postOferta(Oferta nuevaOferta){
        return ofertRepository.postOferta(nuevaOferta);
    }

    public boolean deleteOferta(long id){
        return getOferta(id).map(oferta -> {
            return true;
        }).orElse(false);
    }
}
