package com.Teampruebatecnica.persistence;

import com.Teampruebatecnica.domain.repository.OfertRepository;
import com.Teampruebatecnica.persistence.crud.OfertaCrudReposiry;
import com.Teampruebatecnica.persistence.entity.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/***Notacion para indicar que esta clase se va a conectar con la base de datos
 * por medio de la interfaz OfertaCrudRepository que extiende de  CrudRepository
 */
@Repository
//Clase que estiende de OfertRepository para implementar los metodos que hemos creado en la interfaz
public class OfertasRepository  implements OfertRepository {
    //Se declara la inferfaz que extiende de CrudRepository
    @Autowired
    private OfertaCrudReposiry ofertaCrudReposiry;

    //Metodo que busca todos las ofertas de una tabla
    @Override
    public List<Oferta> getAll() {
        return (List<Oferta>) ofertaCrudReposiry.findAll();
    }

    //Metodo que busca la oferta según el ID
    @Override
    public Optional<Oferta> getById(long id) {
        return ofertaCrudReposiry.findById(id);
    }

    //Metodo que agregar un nuevo registro a la base de datos
    @Override
    public Oferta postOferta(Oferta nuevaOferta) {
        return ofertaCrudReposiry.save(nuevaOferta);
    }

    //Metodo que elimina un elemento de la base de datos
    @Override
    public void deleteOferta(long id) {
        ofertaCrudReposiry.deleteById(id);
    }

    //Metodo que actualiza un registro
    @Override
    public void updateoferta(Oferta ofertaActualizada) {
        ofertaCrudReposiry.findById(ofertaActualizada.getOfferse_id())
                .map(oferta -> {
                    oferta.setName(ofertaActualizada.getName());
                    oferta.setDescription(ofertaActualizada.getDescription());
                    oferta.setPrice_value(ofertaActualizada.getPrice_value());
                    return ofertaCrudReposiry.save(oferta);
                });
    }
}
