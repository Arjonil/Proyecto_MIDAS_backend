/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.dto;

import com.midas.midas.entidades.detalles_meta_usuario;
import com.midas.midas.entidades.meta_financiera;
import com.midas.midas.entidades.tipo_ingreso;
import com.midas.midas.entidades.usuario;
import java.sql.Date;
public class detalles_meta_usuarioDto {
    private Integer idDetalles;
    private Date fechaRegistro;
    private Double montoEntrante;
    private usuario usuario;
    private tipo_ingreso tipoIngreso;//referncia a la tabla tipoIngreso
    private meta_financiera meta_financiera;//primary key referencia a la tabla Meta

    public detalles_meta_usuarioDto() {
    }
    
     public detalles_meta_usuarioDto(detalles_meta_usuario detalles ) {
          this.fechaRegistro = detalles.getFechaRegistro();
        this.montoEntrante = detalles.getMontoEntrante();
        this.usuario = detalles.getUsuario();
        this.tipoIngreso = detalles.getTipoIngreso();
        this.meta_financiera = detalles.getMeta_financiera();
    }

    public detalles_meta_usuarioDto(Date fechaRegistro, Double montoEntrante, usuario usuario, tipo_ingreso tipoIngreso, meta_financiera meta_financiera) {
        this.fechaRegistro = fechaRegistro;
        this.montoEntrante = montoEntrante;
        this.usuario = usuario;
        this.tipoIngreso = tipoIngreso;
        this.meta_financiera = meta_financiera;
    }

    public detalles_meta_usuarioDto(Integer idDetalles, Date fechaRegistro, Double montoEntrante, usuario usuario, tipo_ingreso tipoIngreso, meta_financiera meta_financiera) {
        this.idDetalles = idDetalles;
        this.fechaRegistro = fechaRegistro;
        this.montoEntrante = montoEntrante;
        this.usuario = usuario;
        this.tipoIngreso = tipoIngreso;
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

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public tipo_ingreso getTipoIngreso() {
        return tipoIngreso;
    }

    public void setTipoIngreso(tipo_ingreso tipoIngreso) {
        this.tipoIngreso = tipoIngreso;
    }

    public meta_financiera getMeta_financiera() {
        return meta_financiera;
    }

    public void setMeta_financiera(meta_financiera meta_financiera) {
        this.meta_financiera = meta_financiera;
    }

    public Integer getIdDetalles() {
        return idDetalles;
    }

    public void setIdDetalles(Integer idDetalles) {
        this.idDetalles = idDetalles;
    }

    @Override
    public String toString() {
        return "detalles_meta_usuarioDto{" + "fechaRegistro=" + fechaRegistro + ", montoEntrante=" + montoEntrante + ", usuario=" + usuario + ", tipoIngreso=" + tipoIngreso + ", meta_financiera=" + meta_financiera + '}';
    }


    
    
    
}
