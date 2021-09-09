
package Univ.Java.HolaSpring.dao;

import Univ.Java.HolaSpring.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonaDAO extends JpaRepository<Persona, Long>{
    
}
