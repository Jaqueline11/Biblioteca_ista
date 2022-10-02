package com.example.prueba_base.services;

import com.example.prueba_base.model.Prestamo;
import com.example.prueba_base.model.Usuarios;
import com.example.prueba_base.models.dao.IPrestamoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import javax.persistence.Convert;

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


	@Override
	@Transactional(readOnly = true)
	public List<Prestamo> findAllByUsuario(Optional<Usuarios> u) {
		return (List<Prestamo>) prestamoDao.findAllByUsuario(u.orElse(null));
	}


	@Override
	public List<Prestamo> findAllByEstado_prestamo(String estado_prestamo) {
		return (List<Prestamo>) prestamoDao.findAllByEstado_prestamo(estado_prestamo);
	}







	



	


}
