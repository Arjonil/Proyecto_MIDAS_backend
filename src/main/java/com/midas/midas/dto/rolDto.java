/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.dto;

import com.midas.midas.entidades.rol;
public class rolDto {

  
  
    private Integer idRol;
    private String nombre;

    public rolDto(rol rol) {
        this.idRol=rol.getIdRol();
        this.nombre=rol.getNombre();
    }
    
    

    public rolDto() {
    }

    public rolDto(String nombre) {
        this.nombre = nombre;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      public rolDto(Integer idRol, String nombre) {
        this.idRol = idRol;
        this.nombre = nombre;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Override
    public String toString() {
        return "rolDto{" + "idRol=" + idRol + ", nombre=" + nombre + '}';
    }

    

   

   
    
}
