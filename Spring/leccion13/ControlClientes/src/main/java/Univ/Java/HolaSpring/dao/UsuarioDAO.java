
package Univ.Java.HolaSpring.dao;

import Univ.Java.HolaSpring.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioDAO extends JpaRepository<Usuario , Long>{
    Usuario findByUsername(String username);
}
