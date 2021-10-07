package com.sergio.personabackend.service;

import com.sergio.personabackend.entity.Pais;

import java.util.List;
import java.util.Optional;

public interface PaisService{
    public Optional<Pais> findById(int id);
    public List<Pais> list();
}
