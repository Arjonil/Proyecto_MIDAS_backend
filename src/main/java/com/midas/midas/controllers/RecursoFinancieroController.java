/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.controllers;

import com.midas.midas.dto.recurso_educativoDto;
import com.midas.midas.entidades.recurso_educativo;
import com.midas.midas.services.recurso_educativoService;
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
@RequestMapping("/recursosFinancieros")
public class RecursoFinancieroController {

    @Autowired
    private recurso_educativoService servicio;

    @GetMapping()
    public ResponseEntity<Object> get() {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            List<recurso_educativoDto> list = servicio.findAll();
            return new ResponseEntity<Object>(list, HttpStatus.OK);
        } catch (Exception e) {
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable Integer id) {
        try {
            recurso_educativo data = servicio.findById(id);
            return new ResponseEntity<Object>(data, HttpStatus.OK);
        } catch (Exception e) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping()
    public ResponseEntity<Object> create(@RequestBody recurso_educativoDto recurso) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            recurso_educativo res = servicio.save(recurso);
            return new ResponseEntity<Object>(res, HttpStatus.OK);
        } catch (Exception e) {
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@RequestBody recurso_educativoDto recurso, @PathVariable Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {

            recurso_educativo nuevoTipo = servicio.edit(id, recurso);

            return new ResponseEntity<Object>(nuevoTipo, HttpStatus.OK);
        } catch (Exception e) {
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            servicio.delete(id);
            map.put("deleted", true);
            return new ResponseEntity<Object>(map, HttpStatus.OK);
        } catch (Exception e) {
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
