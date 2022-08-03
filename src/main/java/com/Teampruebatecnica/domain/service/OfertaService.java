package com.Teampruebatecnica.domain.service;

import com.Teampruebatecnica.domain.repository.OfertRepository;
import com.Teampruebatecnica.persistence.entity.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfertaService {
    //Injeccion de la interfaz que usan la clase que hace las consultas a la base de datos
    @Autowired
    private OfertRepository ofertRepository;

    /***Metodo que tiene como fin llamar el metodo de la clase que se conecta con la base de datos para
     * obtener todos las ofertas
     * */
    public List<Oferta> getAll(){
        return ofertRepository.getAll();
    }
    /***Metodo que tiene como fin llamar el metodo de la clase que se conecta con la base de datos para
     * obtener todos la oferta por ID
     * */
    public Optional<Oferta> getOferta(long id){
        return ofertRepository.getById(id);
    }
    /***Metodo que tiene como fin llamar el metodo de la clase que se conecta con la base de datos para
     * agregar un nuevo registro
     * */
    public Oferta postOferta(Oferta nuevaOferta){
        return ofertRepository.postOferta(nuevaOferta);
    }

    /***Metodo que tiene como fin llamar el metodo de la clase que se conecta con la base de datos para
     * eliminar la oferta segun el ID
     * */
    public boolean deleteOferta(long id){
        return getOferta(id).map(oferta -> {
            ofertRepository.deleteOferta(id);
            return true;
        }).orElse(false);
    }
    /***Metodo que tiene como fin llamar el metodo de la clase que se conecta con la base de datos para
     * actualizar un registro de la base de datos
     * */

    public boolean updateOferta(Oferta ofertaActualizada){
        System.out.println(ofertaActualizada.getOfferse_id());
        ofertRepository.updateoferta(ofertaActualizada);
        return getOferta(ofertaActualizada.getOfferse_id()).map(oferta -> {
            ofertRepository.updateoferta(ofertaActualizada);
            return true;
        }).orElse(false);
    }
}
