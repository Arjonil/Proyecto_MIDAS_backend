/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.midas.midas.repository;

import com.midas.midas.dto.detalles_meta_usuarioDto;
import com.midas.midas.entidades.detalles_meta_usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IDetallesRepository extends JpaRepository<detalles_meta_usuario,Integer> {

   
}
