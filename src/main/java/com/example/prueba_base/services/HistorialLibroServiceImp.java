package com.example.prueba_base.services;

import com.example.prueba_base.model.HistorialLibro;
import com.example.prueba_base.model.Libro;
import com.example.prueba_base.model.Tipo;
import com.example.prueba_base.models.dao.IHistorialLibroDao;
import com.example.prueba_base.models.dao.ILibroDao;
import com.example.prueba_base.models.dao.ITipoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HistorialLibroServiceImp implements IHistorialLibroService{
    @Autowired
    private IHistorialLibroDao historialdao;
    

    @Override
    @Transactional(readOnly = true)
    public List<HistorialLibro> findAll() {
        return (List<HistorialLibro>) historialdao.findAll();
    }

    @Override
    @Transactional
    public HistorialLibro save(HistorialLibro c) {
        return historialdao.save(c);
    }


    @Override
    @Transactional
    public void delete(Integer id) {
        historialdao.deleteById(id);
    }

	@Override
	public HistorialLibro findById(Integer id) {
		// TODO Auto-generated method stub
		return historialdao.findById(id).orElse(null);
	}

}
