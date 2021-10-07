package com.sergio.personabackend.rest;

import com.sergio.personabackend.entity.Pais;
import com.sergio.personabackend.service.PaisService;
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
@RequestMapping("/pais")
public class PaisRest {
    @Autowired
    private PaisService paisService;

    @GetMapping("/{id}")
    @Transactional(readOnly = true)
    public ResponseEntity<?> getById(@PathVariable int id){
        Optional<Pais> pais = paisService.findById(id);
        if(!pais.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pais);
    }

    @GetMapping
    @Transactional(readOnly = true)
    public ResponseEntity<List<Pais>> getAll(){
        return ResponseEntity.ok(paisService.list());
    }
}
