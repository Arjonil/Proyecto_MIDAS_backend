/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.dto;

import com.midas.midas.entidades.tipo_ingreso;
public class tipo_ingresoDto {
   
  private  Integer idTipoIngreso ;
    
  private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tipo_ingresoDto(Integer idTipoIngreso, String nombre) {
        this.idTipoIngreso = idTipoIngreso;
        this.nombre = nombre;
    }

    public tipo_ingresoDto() {
    }

    public tipo_ingresoDto(String nombre) {
        this.nombre = nombre;
    }

    public tipo_ingresoDto(tipo_ingreso tipo) {
        this.idTipoIngreso=tipo.getIdTipoIngreso();
        this.nombre=tipo.getNombre();
    }

    public Integer getIdTipoIngreso() {
        return idTipoIngreso;
    }

    public void setIdTipoIngreso(Integer idTipoIngreso) {
        this.idTipoIngreso = idTipoIngreso;
    }

    @Override
    public String toString() {
        return "tipo_ingresoDto{" + "idTipoIngreso=" + idTipoIngreso + ", nombre=" + nombre + '}';
    }

   
  
  
    
}
