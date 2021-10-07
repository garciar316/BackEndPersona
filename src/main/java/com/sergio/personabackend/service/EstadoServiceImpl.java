package com.sergio.personabackend.service;

import com.sergio.personabackend.entity.Estado;
import com.sergio.personabackend.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoServiceImpl implements EstadoService{
    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> findAllById_Pais(int id_pais) {
        return estadoRepository.findAllById_Pais(id_pais);
    }

    @Override
    public Optional<Estado> findById(int id) {
        return estadoRepository.findById(id);
    }
}