/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.services;

import com.midas.midas.dto.detalles_meta_usuarioDto;
import com.midas.midas.entidades.detalles_meta_usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.midas.midas.repository.IDetallesRepository;
import java.util.ArrayList;
import org.modelmapper.ModelMapper;
@Service
public class detallesService {
    @Autowired
    private IDetallesRepository detallesRepositorio;
    private ModelMapper mapeador = new ModelMapper();
    
    public detalles_meta_usuario save(detalles_meta_usuarioDto ahorro){
        
        detalles_meta_usuario detalles= mapeador.map(ahorro, detalles_meta_usuario.class);
        return this.detallesRepositorio.save(detalles);
    }  
    
    
    public List<detalles_meta_usuarioDto> findAll(){
        
        List<detalles_meta_usuario> detalles= this.detallesRepositorio.findAll();
        List<detalles_meta_usuarioDto> dto= new ArrayList<>();
        for(detalles_meta_usuario item: detalles){
            dto.add(mapeador.map(item, detalles_meta_usuarioDto.class));
        }
        return dto;
    }
    
    public detalles_meta_usuario findById(Integer id){
        return this.detallesRepositorio.findById(id).orElse(null);
    }
    
    public void delete(int id){
        this.detallesRepositorio.deleteById(id);
    }
    
    public detalles_meta_usuario edit(Integer id, detalles_meta_usuarioDto detalles){
        detalles_meta_usuario nuevoAhorro=this.detallesRepositorio.findById(id).orElse(null);
        if(!(nuevoAhorro==null)){
            nuevoAhorro.setFechaRegistro(detalles.getFechaRegistro());
            nuevoAhorro.setMeta_financiera(detalles.getMeta_financiera());
            nuevoAhorro.setMontoEntrante(detalles.getMontoEntrante());
            nuevoAhorro.setTipoIngreso(detalles.getTipoIngreso());
            return this.detallesRepositorio.save(nuevoAhorro);
        }
        return null;
    } 
}
