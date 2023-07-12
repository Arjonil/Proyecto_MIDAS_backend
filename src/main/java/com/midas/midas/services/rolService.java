/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.services;

import com.midas.midas.dto.rolDto;
import com.midas.midas.entidades.rol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.midas.midas.repository.IRolRepository;
import java.util.ArrayList;
import org.modelmapper.ModelMapper;
@Service
public class rolService {
    @Autowired
    private IRolRepository rolRepositorio;
    private final ModelMapper mapeador= new ModelMapper();
    
    public rol save(rolDto rol){
       rol r= mapeador.map(rol, rol.class);
        return this.rolRepositorio.save(r);
    }
    public List<rolDto> findAll(){
        Iterable<rol> roles = this.rolRepositorio.findAll();
        List<rolDto> dtos;
        dtos = new ArrayList<>();
        for(rol item: roles ){
            dtos.add(mapeador.map(item, rolDto.class));
        }
        
        return  dtos;
    }
    
    public rol findById(Integer id){
        return this.rolRepositorio.findById(id).orElse(null);
    }
    
    public void delete(int  id){
        this.rolRepositorio.deleteById(id);
    }
    
    public rol edit(Integer id, rolDto rol){
        rol nuevoRol=this.rolRepositorio.findById(id).orElse(null);
        
        if(!(nuevoRol==null)){
            nuevoRol.setNombre(rol.getNombre());
            return this.rolRepositorio.save(nuevoRol);
            
        }
        return null;
    }
}
