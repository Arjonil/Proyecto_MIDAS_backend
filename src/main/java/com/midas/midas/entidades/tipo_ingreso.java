/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="tipo_ingreso")
public class tipo_ingreso {
    
  @Id
  @GeneratedValue()
  private  Integer idTipoIngreso ;
 
  @Column
  private String nombre;
  
  @OneToMany(mappedBy="tipoIngreso")
  List<detalles_meta_usuario> detalles_tipo;

    public tipo_ingreso() {
    }

    public tipo_ingreso(Integer idTipoIngreso, String nombre, List<detalles_meta_usuario> detalles_ahorro) {
        this.idTipoIngreso = idTipoIngreso;
        this.nombre = nombre;
        this.detalles_tipo = detalles_ahorro;
    }

    public Integer getIdTipoIngreso() {
        return idTipoIngreso;
    }

    public void setIdTipoIngreso(Integer idTipoIngreso) {
        this.idTipoIngreso = idTipoIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<detalles_meta_usuario> getDetalles_tipo() {
        return detalles_tipo;
    }

    public void setDetalles_tipo(List<detalles_meta_usuario> detalles_tipo) {
        this.detalles_tipo = detalles_tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idTipoIngreso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final tipo_ingreso other = (tipo_ingreso) obj;
        return Objects.equals(this.idTipoIngreso, other.idTipoIngreso);
    }

    public tipo_ingreso(String nombre, List<detalles_meta_usuario> detalles_tipo) {
        this.nombre = nombre;
        this.detalles_tipo = detalles_tipo;
    }
  
}
