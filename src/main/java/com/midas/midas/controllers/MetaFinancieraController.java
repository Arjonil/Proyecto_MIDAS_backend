/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.controllers;

import com.midas.midas.dto.meta_financieraDto;
import com.midas.midas.entidades.meta_financiera;
import com.midas.midas.services.meta_financieraService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/metasFinancieras")
public class MetaFinancieraController {
    @Autowired
    private meta_financieraService servicio;
    
    @GetMapping()
    public ResponseEntity<Object> get(){
        Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<meta_financieraDto> list  = servicio.findAll();
			return new ResponseEntity<Object>(list,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable Integer id){
        try {
			meta_financiera data  = servicio.findById(id);
			return new ResponseEntity<Object>(data,HttpStatus.OK);
		} 
		catch (Exception e) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
    }
    
    @PostMapping()
    public ResponseEntity<Object> create(@RequestBody meta_financieraDto meta){
        Map<String, Object> map = new HashMap<String, Object>();
		try {
			meta_financiera res = servicio.save(meta);  
			return new ResponseEntity<Object>(res,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
    }
    
        @PutMapping("/{id}")
        public ResponseEntity<Object> update(@RequestBody meta_financieraDto meta, @PathVariable Integer id){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			
			servicio.edit(id, meta);
			
			return new ResponseEntity<Object>(meta,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Integer id){
        Map<String, Object> map = new HashMap<String, Object>();
		try { 
			servicio.delete(id);
			map.put("deleted", true);
			return new ResponseEntity<Object>(map,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
    }  
}
