/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.dto;

import com.midas.midas.entidades.meta_financiera;
import java.sql.Date;
public class meta_financieraDto {
     
    private Integer idMeta;
    private String titulo;
    private String descripcion ;
    private Date fechaInicio;
    private Date fechaFin;
    private double montoAhorro;

    public meta_financieraDto(String titulo, String descripcion, Date fechaInicio, Date fechaFin, double montoAhorro) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoAhorro = montoAhorro;
    }

    public meta_financieraDto() {
    }

    public meta_financieraDto(Integer idMeta, String titulo, String descripcion, Date fechaInicio, Date fechaFin, double montoAhorro) {
        this.idMeta = idMeta;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoAhorro = montoAhorro;
    }
    
    public meta_financieraDto(meta_financiera meta ) {
        this.titulo = meta.getTitulo();
        this.descripcion = meta.getDescripcion();
        this.fechaInicio = meta.getFechaInicio();
        this.fechaFin = meta.getFechaFin();
        this.montoAhorro = meta.getMontoAhorro();
        
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

    public double getMontoAhorro() {
        return montoAhorro;
    }

    public void setMontoAhorro(double montoAhorro) {
        this.montoAhorro = montoAhorro;
    }

    public Integer getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(Integer idMeta) {
        this.idMeta = idMeta;
    }

    @Override
    public String toString() {
        return "meta_financieraDto{" + "idMeta=" + idMeta + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", montoAhorro=" + montoAhorro + '}';
    }

   
    
    
}
