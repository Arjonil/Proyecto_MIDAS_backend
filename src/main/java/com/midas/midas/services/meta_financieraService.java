/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.services;

import com.midas.midas.dto.meta_financieraDto;
import com.midas.midas.entidades.meta_financiera;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.midas.midas.repository.IMetaFinancieraRepository;
import java.util.ArrayList;
import org.modelmapper.ModelMapper;
@Service
public class meta_financieraService {
    @Autowired
    private IMetaFinancieraRepository metaRepositorio;
  private ModelMapper mapeador = new ModelMapper();
    
    public meta_financiera save(meta_financieraDto meta){
        meta_financiera metaF = mapeador.map(meta, meta_financiera.class);
        return this.metaRepositorio.save(metaF);
    }   
    public List<meta_financieraDto> findAll(){
        List<meta_financiera> metas= this.metaRepositorio.findAll();
        List<meta_financieraDto> dto= new ArrayList<>();
        for(meta_financiera item: metas){
            dto.add(mapeador.map(item,meta_financieraDto.class));
        }
        return dto;
    }
    
    public meta_financiera findById(Integer id){
        return this.metaRepositorio.findById(id).orElse(null);
    }
    
    public void delete(int id){
        this.metaRepositorio.deleteById(id);
    }
    
    public meta_financiera edit(Integer id, meta_financieraDto meta){
        meta_financiera nuevo=this.metaRepositorio.findById(id).orElse(null);
        if(!(nuevo==null)){
            nuevo.setDescripcion(meta.getDescripcion());
            nuevo.setFechaFin(meta.getFechaFin());
            nuevo.setFechaInicio(meta.getFechaInicio());
            nuevo.setTitulo(meta.getTitulo());
            return this.metaRepositorio.save(nuevo);
        }
        return null;
    }   
}
