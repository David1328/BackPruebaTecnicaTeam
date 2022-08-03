package com.Teampruebatecnica.domain.repository;

import com.Teampruebatecnica.persistence.entity.Oferta;

import java.util.List;
import java.util.Optional;

/*Interfaz que tiene como fin tener los metodos que se va a usar para los servicios
ademas permitir la inyecsion del mismo en la clase service
* */
public interface OfertRepository {
    //Metodo declarado con el fin de retornar todos las ofertas
    List<Oferta> getAll();
    //Metodo declarado con el fin de retornar oferta por ID
    Optional<Oferta> getById(long id);
    //Metodo declarado con el fin de de agregar una nueva oferta
    Oferta postOferta(Oferta nuevaOferta);
    //Metodo declarado con el fin eliminar una oferta
    void deleteOferta(long id);
    //Metodo declarado con el fin de ser usado para actualizar una compra
    void updateoferta(Oferta ofertaActualizada);
}
