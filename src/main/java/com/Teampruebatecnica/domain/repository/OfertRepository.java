package com.Teampruebatecnica.domain.repository;

import com.Teampruebatecnica.persistence.entity.Oferta;

import java.util.List;
import java.util.Optional;

public interface OfertRepository {
    List<Oferta> getAll();
    Optional<Oferta> getById(long id);
    Oferta postOferta(Oferta nuevaOferta);
    void deleteOferta(long id);
}
