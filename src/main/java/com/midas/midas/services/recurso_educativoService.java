/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.services;

import com.midas.midas.dto.recurso_educativoDto;
import com.midas.midas.entidades.recurso_educativo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.midas.midas.repository.IRecursoEducativoRepository;
import java.util.ArrayList;
import org.modelmapper.ModelMapper;
@Service
public class recurso_educativoService {
    @Autowired
    private IRecursoEducativoRepository recursoRepositorio;
    private final ModelMapper mapeador = new ModelMapper();
    
    
    public recurso_educativo save(recurso_educativoDto recurso){
        recurso_educativo recursoE= mapeador.map(recurso, recurso_educativo.class);
        return this.recursoRepositorio.save(recursoE);
    }
    public List<recurso_educativoDto> findAll(){
        List<recurso_educativo> recursos=this.recursoRepositorio.findAll();
        List<recurso_educativoDto> dto= new ArrayList<>();
        for(recurso_educativo item: recursos){
            dto.add(mapeador.map(item, recurso_educativoDto.class));
        }
        return dto;
    }
    
    public recurso_educativo findById(Integer id){
        return this.recursoRepositorio.findById(id).orElse(null);
    }
    
    public void delete(int id){
        this.recursoRepositorio.deleteById(id);
    }
    
    public recurso_educativo edit(Integer id, recurso_educativoDto recurso){
        recurso_educativo nuevo=this.recursoRepositorio.findById(id).orElse(null);
        if(!(nuevo==null)){
            nuevo.setDescripcion(recurso.getDescripcion());
            nuevo.setUsuario(recurso.getUsuario());
            nuevo.setTema(recurso.getTema());
            nuevo.setUrl(recurso.getUrl());
            nuevo.setTitulo(recurso.getTitulo());
            return this.recursoRepositorio.save(nuevo);
        }
        return null;
    }   
}
