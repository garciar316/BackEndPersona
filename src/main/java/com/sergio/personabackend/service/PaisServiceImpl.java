package com.sergio.personabackend.service;

import com.sergio.personabackend.entity.Pais;
import com.sergio.personabackend.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PaisServiceImpl implements PaisService{
    @Autowired
    private PaisRepository paisRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Pais> findById(int id) {
        return paisRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pais> list() {
        return paisRepository.findAll();
    }
}
