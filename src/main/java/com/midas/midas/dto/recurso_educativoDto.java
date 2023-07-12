/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.dto;

import com.midas.midas.entidades.recurso_educativo;
import com.midas.midas.entidades.usuario;
public class recurso_educativoDto {
   private Integer idRecurso;
    private String titulo;
    private String descripcion;
    private String url;
    private String tema;
    private usuario usuario; //referencia a la tabla usuario

    public recurso_educativoDto() {
    }
    
    public recurso_educativoDto(recurso_educativo recurso) {
          this.titulo = recurso.getTitulo();
        this.descripcion = recurso.getDescripcion();
        this.url = recurso.getUrl();
        this.tema = recurso.getTema();
        this.usuario = recurso.getUsuario();
    }

    public recurso_educativoDto(Integer idRecurso, String titulo, String descripcion, String url, String tema, usuario usuario) {
        this.idRecurso = idRecurso;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.tema = tema;
        this.usuario = usuario;
    }


    public recurso_educativoDto(String titulo, String descripcion, String url, String tema, usuario usuario) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.tema = tema;
        this.usuario = usuario;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

  
    public Integer getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(Integer idRecurso) {
        this.idRecurso = idRecurso;
    }

    @Override
    public String toString() {
        return "recurso_educativoDto{" + "idRecurso=" + idRecurso + ", titulo=" + titulo + ", descripcion=" + descripcion + ", url=" + url + ", tema=" + tema + ", usuario=" + usuario + '}';
    }
    
    
    
}
