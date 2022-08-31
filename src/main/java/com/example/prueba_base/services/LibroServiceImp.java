package com.example.prueba_base.services;

import com.example.prueba_base.model.Libro;
import com.example.prueba_base.models.dao.ILibroDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LibroServiceImp implements ILibroService{
    @Autowired
    //Declaro el atributo del Dao
    private ILibroDao libroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Libro> findAll() {
        return (List<Libro>) libroDao.findAll();
    }

    @Override
    @Transactional
    public Libro save(Libro c) {
        return libroDao.save(c);
    }

    @Override
    @Transactional(readOnly = true)
    public Libro findById(Integer id) {
        return libroDao.findById(id).orElse(null);
    }


    @Override
    @Transactional
    public void delete(Integer id) {
        libroDao.deleteById(id);
    }

}
