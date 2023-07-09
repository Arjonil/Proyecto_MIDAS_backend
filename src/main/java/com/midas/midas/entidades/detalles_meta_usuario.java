/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.entidades;

import java.sql.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="detalles_meta_usuario")
public class detalles_meta_usuario  {
    @Id
    @GeneratedValue()
    private Integer idDetalles;
    @Column
    private Date fechaRegistro;
    @Column
    private Double montoEntrante;
    
    @ManyToOne()
    @JoinColumn(name="usuario_id")
    private usuario usuario;
    @ManyToOne()
    @JoinColumn(name="tipo_id")
    private tipo_ingreso tipoIngreso;//referncia a la tabla tipoIngreso
    
    @ManyToOne()
    @JoinColumn(name="meta_id")    
    private meta_financiera meta_financiera;//primary key referencia a la tabla Meta

    public detalles_meta_usuario() {
    }

    public detalles_meta_usuario(Date fechaRegistro, Double montoEntrante, usuario usuario, tipo_ingreso tipoIngreso, meta_financiera meta_financiera) {
        this.fechaRegistro = fechaRegistro;
        this.montoEntrante = montoEntrante;
        this.usuario = usuario;
        this.tipoIngreso = tipoIngreso;
        this.meta_financiera = meta_financiera;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public detalles_meta_usuario(Integer idDetalles, Date fechaRegistro, Double montoEntrante, usuario usuario, tipo_ingreso tipoIngreso, meta_financiera meta_financiera) {
        this.idDetalles = idDetalles;
        this.fechaRegistro = fechaRegistro;
        this.montoEntrante = montoEntrante;
        this.usuario = usuario;
        this.tipoIngreso = tipoIngreso;
        this.meta_financiera = meta_financiera;
    }

   
   

   

    public meta_financiera getMeta_financiera() {
        return meta_financiera;
    }

    public void setMeta_financiera(meta_financiera meta_financiera) {
        this.meta_financiera = meta_financiera;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Double getMontoEntrante() {
        return montoEntrante;
    }

    public void setMontoEntrante(Double montoEntrante) {
        this.montoEntrante = montoEntrante;
    }

    public tipo_ingreso getTipoIngreso() {
        return tipoIngreso;
    }

    public void setTipoIngreso(tipo_ingreso tipoIngreso) {
        this.tipoIngreso = tipoIngreso;
    }

    public Integer getIdDetalles() {
        return idDetalles;
    }

    public void setIdDetalles(Integer idDetalles) {
        this.idDetalles = idDetalles;
    }

    @Override
    public String toString() {
        return "DETALLES_REGISTRO_AHORRO{" + "idDetalles=" + idDetalles +  ", idDetallesMeta=" + meta_financiera + ", fechaRegistro=" + fechaRegistro + ", montoEntrante=" + montoEntrante + ", tipoIngreso=" + tipoIngreso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idDetalles);
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
        final detalles_meta_usuario other = (detalles_meta_usuario) obj;
        return Objects.equals(this.idDetalles, other.idDetalles);
    }

    
    
    
            
}
