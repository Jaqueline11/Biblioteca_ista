package com.example.prueba_base.services;

import com.example.prueba_base.model.Persona;
import com.example.prueba_base.models.dao.IPersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImp implements IPersonaService{
    @Autowired
    private IPersonaDao personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> findAll() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public Persona save(Persona c) {
        return personaDao.save(c);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona findById(Integer id) {
        return personaDao.findById(id).orElse(null);
    }

    @Override
    public Optional<Persona> findByUsuario(String usuario) {
        return personaDao.findByUsuario(usuario);
    }

    @Override
    public Optional<Persona> findByUsuarioAndClave(String usuario, String clave) {
        return personaDao.findByUsuarioAndClave(usuario, clave);
    }


    @Override
    @Transactional
    public void delete(Integer id) {
        personaDao.deleteById(id);
    }

    @Override
    public boolean validacionLogin(String usu, String password) {
        Optional<Persona> per=findByUsuario(usu);
        if(per.isPresent() && per.get().getClave().equals(password)){
            return true;
        }
        return false;
    }

    @Override
    public boolean validacionActivo(String usu, String password) {
        Optional<Persona> per=findByUsuarioAndClave(usu,password);
        if (per.get().getActivo()==true){

            return true;
        }else{
            return false;
        }


    }

	@Override
	public int rolpersona(String usuario) {
		return personaDao.findByUsuario(usuario).get().getRol();
	}

}
