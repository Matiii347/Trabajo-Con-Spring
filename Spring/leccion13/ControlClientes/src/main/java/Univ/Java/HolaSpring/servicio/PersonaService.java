/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Univ.Java.HolaSpring.servicio;

import Univ.Java.HolaSpring.domain.Persona;
import java.util.List;

/**
 *
 * @author MARTIN TORRES
 */
public interface PersonaService  {
    
    public List<Persona>ListarPersona();
    
    public void Guardar(Persona persona);
    
    public void Eliminar(Persona persona);
    
    public Persona EncontrarPersona(Persona persona);
    
    
}
