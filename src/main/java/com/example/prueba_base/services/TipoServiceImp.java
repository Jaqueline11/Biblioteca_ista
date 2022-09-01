package com.example.prueba_base.services;

import com.example.prueba_base.model.Libro;
import com.example.prueba_base.model.Tipo;
import com.example.prueba_base.models.dao.ILibroDao;
import com.example.prueba_base.models.dao.ITipoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoServiceImp implements ITipoService{
    @Autowired
    private ITipoDao tipodao;

    @Override
    @Transactional(readOnly = true)
    public List<Tipo> findAll() {
        return (List<Tipo>) tipodao.findAll();
    }

    @Override
    @Transactional
    public Tipo save(Tipo c) {
        return tipodao.save(c);
    }


    @Override
    @Transactional
    public void delete(Integer id) {
        tipodao.deleteById(id);
    }

	@Override
	public Tipo findById(Integer id) {
		// TODO Auto-generated method stub
		return tipodao.findById(id).orElse(null);
	}

}
