package com.sergio.personabackend.service;

import com.sergio.personabackend.entity.Persona;
import com.sergio.personabackend.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Iterable<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> findById(int id) {
        return personaRepository.findById(id);
    }

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void deleteById(int id) {
        personaRepository.deleteById(id);
    }
}
