/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.services;

import com.midas.midas.dto.usuarioDto;
import com.midas.midas.entidades.usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.midas.midas.repository.IUsuarioRepository;
import java.util.ArrayList;
import org.modelmapper.ModelMapper;
@Service
public class usuarioService {
    @Autowired
    private IUsuarioRepository usuarioRepositorio;
    private final ModelMapper  mapeador= new ModelMapper();
    
    public usuario save(usuarioDto usuario){
        usuario u = mapeador.map(usuario, usuario.class);
        return this.usuarioRepositorio.save(u);
    }
    public List<usuarioDto> findAll(){
        List<usuario> usuarios = this.usuarioRepositorio.findAll();
        List<usuarioDto> dtos = new ArrayList<>();
        for(usuario item: usuarios ){
            dtos.add(mapeador.map(item, usuarioDto.class));
        }
        
        return  dtos;
    }
    
    public usuario findById(Integer id){
        return this.usuarioRepositorio.findById(id).orElse(null);
    }
    
    public void delete(int id){
        this.usuarioRepositorio.deleteById(id);
    }
    
    public usuario edit(Integer id, usuarioDto usuarioActualizado){
        usuario usuario= mapeador.map(usuarioActualizado, usuario.class);
        usuario nuevo=this.usuarioRepositorio.findById(id).orElse(null);
        if(!(nuevo==null)){
            nuevo.setApellidos(usuario.getApellidos());
            nuevo.setContraseña(usuario.getContraseña());
            nuevo.setCorreo(usuario.getCorreo());
            nuevo.setNombreUsuario(usuario.getNombreUsuario());
            nuevo.setNombres(usuario.getNombres());
            nuevo.setRol(usuario.getRol());
           
            
            return this.usuarioRepositorio.save(nuevo);
        }
        return null;
       
    }  
    
    public String login(String correo, String contraseña){
        
        
        return null;
        
    }
}
