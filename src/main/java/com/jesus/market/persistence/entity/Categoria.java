package com.jesus.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categorias")

public class Categoria {

    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;

    private String descripcion;

    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}
