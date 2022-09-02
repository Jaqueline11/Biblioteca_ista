package com.example.prueba_base.services;

import com.example.prueba_base.model.Bibliotecarios;
import com.example.prueba_base.models.dao.IBibliotecarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BibliotecarioServiceImp implements IBibliotecarioService{
    @Autowired
    private IBibliotecarioDao libroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Bibliotecarios> findAll() {
        return (List<Bibliotecarios>) libroDao.findAll();
    }

    @Override
    @Transactional
    public Bibliotecarios save(Bibliotecarios c) {
        return libroDao.save(c);
    }

    @Override
    @Transactional(readOnly = true)
    public Bibliotecarios findById(Integer id) {
        return libroDao.findById(id).orElse(null);
    }


    @Override
    @Transactional
    public void delete(Integer id) {
        libroDao.deleteById(id);
    }

}
