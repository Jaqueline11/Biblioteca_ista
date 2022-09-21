package com.example.prueba_base.services;

import com.example.prueba_base.model.Persona;
import com.example.prueba_base.model.Usuarios;
import com.example.prueba_base.models.dao.IPersonaDao;
import com.example.prueba_base.models.dao.IUsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImp implements IUsuarioService{
    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuarios> findAll() {
        return (List<Usuarios>) usuarioDao.findAll();
    }

    @Override
    @Transactional
    public Usuarios save(Usuarios c) {
        return usuarioDao.save(c);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuarios findById(Integer id) {
        return usuarioDao.findById(id).orElse(null);
    }

	@Override
	public void delete(Integer id) {
        usuarioDao.deleteById(id);		
	}

	@Override
	public Optional<Usuarios> findbyid_person(Persona pp) {
		return usuarioDao.findByPersona(pp);
	}



}
