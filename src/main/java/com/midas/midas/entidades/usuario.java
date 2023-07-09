/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.entidades;

import java.util.List;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="usuario")
public class usuario {
    
    @Id
    @GeneratedValue()
    private Integer idUsuario;
    @Column
    private String nombres;
    @Column
    private String apellidos;
    @Column
    private String nombreUsuario;
    @Column
    private String correo;
    @Column
    private String contraseña;
    
    @ManyToOne()
    @JoinColumn(name="rol_id")
    rol rol; //referencia a la tabla rol
    
    @OneToMany(mappedBy="usuario")
    List<recurso_educativo> recursosEducativos;
    
    @OneToMany(mappedBy="usuario")
    List<detalles_meta_usuario> detalles_meta_usuario;


    public usuario(Integer idUsuario, String nombres, String apellidos, String nombreUsuario, String correo, String contraseña, rol rol, List<recurso_educativo> recursosEducativos) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
        this.recursosEducativos = recursosEducativos;
     
    }

    public usuario() {
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public rol getRol() {
        return rol;
    }

    public void setRol(rol rol) {
        this.rol = rol;
    }

    public List<recurso_educativo> getRecursosEducativos() {
        return recursosEducativos;
    }

    public void setRecursosEducativos(List<recurso_educativo> recursosEducativos) {
        this.recursosEducativos = recursosEducativos;
    }

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.idUsuario);
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
        final usuario other = (usuario) obj;
        return Objects.equals(this.idUsuario, other.idUsuario);
    }

    public List<detalles_meta_usuario> getDetalles_meta_usuario() {
        return detalles_meta_usuario;
    }

    public void setDetalles_meta_usuario(List<detalles_meta_usuario> detalles_meta_usuario) {
        this.detalles_meta_usuario = detalles_meta_usuario;
    }

    public usuario(String nombres, String apellidos, String nombreUsuario, String correo, String contraseña, rol rol, List<recurso_educativo> recursosEducativos, List<detalles_meta_usuario> detalles_meta_usuario) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
        this.recursosEducativos = recursosEducativos;
        this.detalles_meta_usuario = detalles_meta_usuario;
    }

    @Override
    public String toString() {
        return "usuario{" + "idUsuario=" + idUsuario + ", nombres=" + nombres + ", apellidos=" + apellidos + ", nombreUsuario=" + nombreUsuario + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", rol=" + rol + ", recursosEducativos=" + recursosEducativos + ", detalles_meta_usuario=" + detalles_meta_usuario + '}';
    }
    
    
}
