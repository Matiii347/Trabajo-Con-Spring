
package Univ.Java.HolaSpring.dao;

import Univ.Java.HolaSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;



public interface PersonaDAO extends CrudRepository<Persona, Long>{
    
}
