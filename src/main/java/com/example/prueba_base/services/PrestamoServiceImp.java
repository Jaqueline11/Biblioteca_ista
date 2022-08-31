package com.example.prueba_base.services;

import com.example.prueba_base.model.Libro;
import com.example.prueba_base.model.Prestamo;
import com.example.prueba_base.models.dao.ILibroDao;
import com.example.prueba_base.models.dao.IPrestamoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PrestamoServiceImp implements IPrestamoService{
    @Autowired
    //Declaro el atributo del Dao
    private IPrestamoDao prestamoDao;

    @Override
    @Transactional(readOnly = true)
    public List <Prestamo> findAll() {
        return (List<Prestamo>) prestamoDao.findAll();
    }
    
    
    @Override
    @Transactional
    public Prestamo save(Prestamo c) {
        return prestamoDao.save(c);
    }

    
    
    
    
    @Override
    @Transactional(readOnly = true)
    public Prestamo findById(Integer id) {
        return prestamoDao.findById(id).orElse(null);
    }

    

    @Override
    @Transactional
    public void delete(Integer id) {
        prestamoDao.deleteById(id);
    }







	



	


}
