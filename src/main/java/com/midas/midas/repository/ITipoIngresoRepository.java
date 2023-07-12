/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.midas.midas.repository;

import com.midas.midas.dto.tipo_ingresoDto;
import com.midas.midas.entidades.tipo_ingreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ITipoIngresoRepository extends JpaRepository<tipo_ingreso,Integer> {

   
}
