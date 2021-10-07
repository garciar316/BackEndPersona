package com.sergio.personabackend.service;

import com.sergio.personabackend.entity.Persona;

import java.util.Optional;

public interface PersonaService {
    public Iterable<Persona> findAll();
    public Optional<Persona> findById(int id);
    public Persona save(Persona persona);
    public void deleteById(int id);
}
