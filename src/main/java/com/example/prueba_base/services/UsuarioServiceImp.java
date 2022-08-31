package com.example.prueba_base.services;

import com.example.prueba_base.model.Usuarios;
import com.example.prueba_base.models.dao.IUsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Transactional
    public void delete(Integer id) {
        usuarioDao.deleteById(id);
    }

}
