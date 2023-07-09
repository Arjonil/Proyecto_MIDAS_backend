/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.entidades;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="meta_financiera")
public class meta_financiera {
    @Id
    @GeneratedValue()
    private Integer idMeta;
    @Column
    private String titulo;
    @Column
    private String descripcion ;
    @Column
    private Date fechaInicio;
    @Column
    private Date fechaFin;
    
    @Column()
    private double montoAhorro;

    public double getMontoAhorro() {
        return montoAhorro;
    }

    public void setMontoAhorro(double montoAhorro) {
        this.montoAhorro = montoAhorro;
    }
   
   
    @OneToMany(mappedBy="meta_financiera")
    List<detalles_meta_usuario> detalles_meta;

    public meta_financiera() {
    }

    public meta_financiera(Integer idMeta, String titulo, String descripcion, Date fechaInicio, Date fechaFin, double montoAhorro, List<detalles_meta_usuario> detalles_meta) {
        this.idMeta = idMeta;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoAhorro = montoAhorro;
        this.detalles_meta = detalles_meta;
    }

    public meta_financiera(String titulo, String descripcion, Date fechaInicio, Date fechaFin, double montoAhorro, List<detalles_meta_usuario> detalles_meta) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoAhorro = montoAhorro;
        this.detalles_meta = detalles_meta;
    }

  

    public Integer getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(Integer idMeta) {
        this.idMeta = idMeta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

  

    public List<detalles_meta_usuario> getDetalles_meta() {
        return detalles_meta;
    }

    public void setDetalles_meta(List<detalles_meta_usuario> detalles_meta) {
        this.detalles_meta = detalles_meta;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.idMeta);
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
        final meta_financiera other = (meta_financiera) obj;
        return Objects.equals(this.idMeta, other.idMeta);
    }

    @Override
    public String toString() {
        return "meta_financiera{" + "idMeta=" + idMeta + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", montoAhorro=" + montoAhorro + ", detalles_meta=" + detalles_meta + '}';
    }
    
    
}
