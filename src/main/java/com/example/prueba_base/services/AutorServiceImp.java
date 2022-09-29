package com.example.prueba_base.services;

import com.example.prueba_base.model.Autor;
import com.example.prueba_base.models.dao.IAutorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AutorServiceImp implements IAutorService{
    @Autowired

    private IAutorDao autorDao;

    @Override
    @Transactional(readOnly = true)
    public List<Autor> findAll() {
        return (List<Autor>) autorDao.findAll();
    }

    @Override
    @Transactional
    public Autor save(Autor c) {
        return autorDao.save(c);
    }

    @Override
    @Transactional(readOnly = true)
    public Autor findById(Integer id) {
        return autorDao.findById(id).orElse(null);
    }


    @Override
    @Transactional
    public void delete(Integer id) {
        autorDao.deleteById(id);
    }

	@Override
	public Autor findByNombre(String nombre) {
		return autorDao.findByNombre(nombre);
	}

	@Override
	public List<Autor> findAllByNombreContaining(String nombre) {
		return autorDao.findAllByNombreContaining(nombre);
	}

}
