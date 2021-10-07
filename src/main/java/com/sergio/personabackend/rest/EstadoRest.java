package com.sergio.personabackend.rest;

import com.sergio.personabackend.entity.Estado;
import com.sergio.personabackend.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estado")
public class EstadoRest {
    @Autowired
    private EstadoService estadoService;

    @GetMapping("/estadospais/{id}")
    @Transactional(readOnly = true)
    public ResponseEntity<List<Estado>> getAllById_Pais(@PathVariable int id_pais){
        return ResponseEntity.ok(estadoService.findAllById_Pais(id_pais));
    }

    @GetMapping("/{id}")
    @Transactional(readOnly = true)
    public ResponseEntity<?> getById(@PathVariable int id){
        Optional<Estado> estado = estadoService.findById(id);
        if(!estado.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(estado);
    }
}
