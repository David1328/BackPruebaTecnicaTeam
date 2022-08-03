package com.Teampruebatecnica.persistence.crud;

import com.Teampruebatecnica.persistence.entity.Oferta;
import org.springframework.data.repository.CrudRepository;

/***Interfaz que extiende de CrudRepository para poder acceder a funciones que
 * tienen cono fin hacer setencias sql a la base de datos
 * **/
public interface OfertaCrudReposiry extends CrudRepository<Oferta,Long> {

}
