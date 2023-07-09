/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.entidades;

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
@Table(name="rol")
public class rol {
    @Id
    @GeneratedValue()
    private Integer idRol;
    @Column
    private String nombre;
    
    @OneToMany(mappedBy="rol")
    List<usuario> usuarios;

    public rol() {
    }

    public rol(String nombre) {
        this.nombre = nombre;
    }

   

    public rol(Integer idRol, String nombre, List<usuario> usuarios) {
        this.idRol = idRol;
        this.nombre = nombre;
        this.usuarios = usuarios;
    }

    public rol(Integer idRol, String nombre) {
        this.idRol = idRol;
        this.nombre = nombre;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "rol{" + "idRol=" + idRol + ", nombre=" + nombre + ", usuarios=" + usuarios + '}';
    }

   

    
    
    
}
