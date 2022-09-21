package com.example.prueba_base.services;

import com.example.prueba_base.model.Bibliotecarios;
import com.example.prueba_base.model.Persona;
import com.example.prueba_base.model.Usuarios;
import com.example.prueba_base.models.dao.IBibliotecarioDao;
import com.example.prueba_base.models.dao.IPersonaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BibliotecarioServiceImp implements IBibliotecarioService{
    @Autowired
    private IBibliotecarioDao bibliotecarioDao;
    @Autowired
    private IPersonaDao personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Bibliotecarios> findAll() {
        return (List<Bibliotecarios>) bibliotecarioDao.findAll();
    }

    @Override
    @Transactional
    public Bibliotecarios save(Bibliotecarios c) {
        return bibliotecarioDao.save(c);
    }

    @Override
    @Transactional(readOnly = true)
    public Bibliotecarios findById(Integer id) {
        return bibliotecarioDao.findById(id).orElse(null);
    }


    @Override
    @Transactional
    public void delete(Integer id) {
        bibliotecarioDao.deleteById(id);
    }
    
    @Override
	public Optional<Bibliotecarios> buscarporcedula(String cedula) {
        Persona per= personaDao.findByCedula(cedula).orElse(null);
		return bibliotecarioDao.findByPersona(per);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Bibliotecarios> findbyid_person(Persona pp) {
		return bibliotecarioDao.findByPersona(pp);
	}


}
