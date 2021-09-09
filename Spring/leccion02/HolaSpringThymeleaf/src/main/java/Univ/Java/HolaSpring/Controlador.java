/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Univ.Java.HolaSpring;

import Univ.Java.HolaSpring.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//va a paginas web html
//rest controller Para afectar el navegador.
@Slf4j//Manejo del Log
public class Controlador {
    
    @GetMapping("/")
    public String Inicio(ModelMap model){
        String saludar="Mensaje con Thymeleaf";
        
        Persona entidad= new Persona();
        entidad.setNombre("Mati");
        entidad.setApellido("Funes");
        entidad.setEmail("matiasracingente");
        entidad.setTelefono("351 ya tu sabes");
        
        Persona entidad2= new Persona();
        entidad2.setNombre("Ale");
        entidad2.setApellido("Espindola");
        entidad2.setEmail("Alekey");
        entidad2.setTelefono("351 ya tu sabes");
        
        List<Persona>pers=new ArrayList();
        pers.add(entidad);
        pers.add(entidad2);

        
        log.info("Ejecuntando el Controlador MVC");
        
        model.addAttribute("saludar", saludar);
       //De forma independiente model.addAttribute("entidad", entidad);
        model.addAttribute("pers", pers);//en Lista
        return "index";
    }
}
