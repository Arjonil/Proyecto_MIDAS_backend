/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.dto;
import com.midas.midas.entidades.usuario;
import org.modelmapper.ModelMapper;
public class usuarioDto {
    private Integer idUsuario;
    private String nombres;
    private String apellidos;
    private String nombreUsuario;
    private String correo;
    private String contraseña;
    private rolDto rol; //referencia a la tabla rol

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

    public rolDto getRol() {
        return rol;
    }

    public void setRol(rolDto rol) {
        this.rol = rol;
    }

    public usuarioDto() {
    }
    
    public usuarioDto(usuario u) {
        this.idUsuario = u.getIdUsuario();
        this.nombres = u.getNombres();
        this.apellidos = u.getApellidos();
        this.nombreUsuario = u.getNombreUsuario();
        this.correo = u.getCorreo();
        this.contraseña = u.getContraseña();
    }
    public usuarioDto(Integer idUsuario, String nombres, String apellidos, String nombreUsuario, String correo, String contraseña, rolDto rol) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public usuarioDto(String nombres, String apellidos, String nombreUsuario, String correo, String contraseña, rolDto rol) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public usuarioDto(String nombres, String apellidos, String nombreUsuario, String correo, String contraseña) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "usuarioDto{" + "idUsuario=" + idUsuario + ", nombres=" + nombres + ", apellidos=" + apellidos + ", nombreUsuario=" + nombreUsuario + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", rol=" + rol + '}';
    }

   
}
