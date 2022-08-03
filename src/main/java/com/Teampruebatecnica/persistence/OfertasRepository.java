package com.Teampruebatecnica.persistence;

import com.Teampruebatecnica.domain.repository.OfertRepository;
import com.Teampruebatecnica.persistence.crud.OfertaCrudReposiry;
import com.Teampruebatecnica.persistence.entity.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OfertasRepository  implements OfertRepository {
    @Autowired
    private OfertaCrudReposiry ofertaCrudReposiry;




    @Override
    public List<Oferta> getAll() {
        return (List<Oferta>) ofertaCrudReposiry.findAll();
    }

    @Override
    public Optional<Oferta> getById(long id) {
        return ofertaCrudReposiry.findById(id);
    }

    @Override
    public Oferta postOferta(Oferta nuevaOferta) {
        return ofertaCrudReposiry.save(nuevaOferta);
    }

    @Override
    public void deleteOferta(long id) {
        ofertaCrudReposiry.deleteById(id);
    }
}
