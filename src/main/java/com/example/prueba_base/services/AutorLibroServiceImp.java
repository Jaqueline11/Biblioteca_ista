package com.example.prueba_base.services;

import com.example.prueba_base.model.AutorLibro;
import com.example.prueba_base.models.dao.IAutorLibroDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AutorLibroServiceImp implements IAutorLibroService{
    @Autowired
    private IAutorLibroDao autorlibroDao;

    @Override
    @Transactional(readOnly = true)
    public List<AutorLibro> findAll() {
        return (List<AutorLibro>) autorlibroDao.findAll();
    }

    @Override
    @Transactional
    public AutorLibro save(AutorLibro c) {
        return autorlibroDao.save(c);
    }

    @Override
    @Transactional(readOnly = true)
    public AutorLibro findById(Integer id) {
        return autorlibroDao.findById(id).orElse(null);
    }


    @Override
    @Transactional
    public void delete(Integer id) {
        autorlibroDao.deleteById(id);
    }

}
