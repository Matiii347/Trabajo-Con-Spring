/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Univ.Java.HolaSpring.servicio;

import Univ.Java.HolaSpring.dao.PersonaDAO;
import Univ.Java.HolaSpring.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaDAO personaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> ListarPersona() {
       return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void Guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void Eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona EncontrarPersona(Persona persona) {
       return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
}
