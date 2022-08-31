package com.example.prueba_base.services;

import com.example.prueba_base.model.Persona;
import com.example.prueba_base.models.dao.IPersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImp implements IPersonaService{
    @Autowired
    private IPersonaDao personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> findAll() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public Persona save(Persona c) {
        return personaDao.save(c);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona findById(Integer id) {
        return personaDao.findById(id).orElse(null);
    }


    @Override
    @Transactional
    public void delete(Integer id) {
        personaDao.deleteById(id);
    }

}
