package com.sergio.personabackend.service;

import com.sergio.personabackend.entity.Estado;

import java.util.List;
import java.util.Optional;

public interface EstadoService {
    public List<Estado> findAllById_Pais(int id_pais);
    public Optional<Estado> findById(int id);
}
