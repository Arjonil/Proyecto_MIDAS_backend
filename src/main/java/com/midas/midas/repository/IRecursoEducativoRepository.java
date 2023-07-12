/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.midas.midas.repository;

import com.midas.midas.dto.recurso_educativoDto;
import com.midas.midas.entidades.recurso_educativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IRecursoEducativoRepository extends JpaRepository<recurso_educativo,Integer> {

   
}
