/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.services;

import com.midas.midas.dto.tipo_ingresoDto;
import com.midas.midas.entidades.tipo_ingreso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.midas.midas.repository.ITipoIngresoRepository;
import java.util.ArrayList;
import org.modelmapper.ModelMapper;
@Service
public class tipo_ingresoService {
    @Autowired
    private ITipoIngresoRepository tipoRepositorio;
    private ModelMapper mapeador = new ModelMapper();
    
    public tipo_ingreso save(tipo_ingresoDto tipo){
        tipo_ingreso tipoI = mapeador.map(tipo, tipo_ingreso.class);
        return this.tipoRepositorio.save(tipoI);
    }
    public List<tipo_ingresoDto> findAll(){
        List<tipo_ingreso> tipos=this.tipoRepositorio.findAll();
        List<tipo_ingresoDto> dto= new ArrayList<>();
        for(tipo_ingreso item: tipos){
            dto.add(mapeador.map(item, tipo_ingresoDto.class));
        }
        return dto;
    }
    
    public tipo_ingreso findById(Integer id){
        return this.tipoRepositorio.findById(id).orElse(null);
    }
    
    public void delete(int id){
        this.tipoRepositorio.deleteById(id);
    }
    
    public tipo_ingreso edit(Integer id, tipo_ingresoDto tipo){
        tipo_ingreso nuevo=this.tipoRepositorio.findById(id).orElse(null);
        if(!(nuevo==null)){
            nuevo.setNombre(tipo.getNombre());
            return this.tipoRepositorio.save(nuevo);
        }
        return null;
    }   
}
