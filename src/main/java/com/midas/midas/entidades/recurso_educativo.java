/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.entidades;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="recurso_educativo")
public class recurso_educativo {
    @Id
    @GeneratedValue()
    private Integer idRecurso;
    @Column
    private String titulo;
    @Column
    private String descripcion;
    @Column
    private String url;
    @Column
    private String tema;
    @ManyToOne
    @JoinColumn(name="usuario_id")
    private usuario usuario; //referencia a la tabla usuario

    public recurso_educativo() {
    }

    public recurso_educativo(Integer idRecurso, String titulo, String descripcion, String url, String tema, usuario idRecursoUsuario) {
        this.idRecurso = idRecurso;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.tema = tema;
        this.usuario = idRecursoUsuario;
    }

    public Integer getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(Integer idRecurso) {
        this.idRecurso = idRecurso;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idRecurso);
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
        final recurso_educativo other = (recurso_educativo) obj;
        return Objects.equals(this.idRecurso, other.idRecurso);
    }

}
