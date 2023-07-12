/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.midas.midas.repository;

import com.midas.midas.dto.meta_financieraDto;
import com.midas.midas.entidades.meta_financiera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IMetaFinancieraRepository extends JpaRepository<meta_financiera,Integer>{

   
}
