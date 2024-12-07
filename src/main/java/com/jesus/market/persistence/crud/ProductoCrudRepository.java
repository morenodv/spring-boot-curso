package com.jesus.market.persistence.crud;

import com.jesus.market.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true) similar al findby
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
